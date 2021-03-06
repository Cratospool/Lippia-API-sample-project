package ar.steps;

import api.config.EntityConfiguration;
import api.model.Categories;
import api.model.Category;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.IOExceptionWithCause;
import org.testng.Assert;
import java.lang.reflect.InvocationTargetException;

public class CatSteps extends PageSteps {
    
    @When("realizo una peticion '(.*)' a '(.*)' al enpoint de categorias - '(.*)'$")
    public void seEjecutaLaOperacion(String operacion, String entity, String request)
                throws IllegalAccessException,IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOExceptionWithCause {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(),String.class).invoke("",request);
      }

    @Then("obtengo el status code '(.*)'")
    public void obtengoElStatusCodeStatusCode(int expCode) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expCode);
    }

    @And("los datos son correctos")
    public void losDatosSonCorrectos() {
        Category[] categories = (Category[]) APIManager.getLastResponse().getResponse();
        int size = categories.length;
        Assert.assertEquals(size,7);
    }

    @When("realizo una peticion '(.*)' a '(.*)' al enpoint de analisis - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEnpointDeAnalisisRequest(String operacion, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(),String.class).invoke("",request);
    }
}
