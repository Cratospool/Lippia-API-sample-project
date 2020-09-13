package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import org.apache.commons.io.IOExceptionWithCause;

import java.lang.reflect.InvocationTargetException;


public class SpotifySteps extends PageSteps {

    @When("realizo una peticion '(.*)' a '(.*)' al enpoint de spotify - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEnpointDeSpotifyRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
        {
            EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(),String.class).invoke("",request);
    }
}
