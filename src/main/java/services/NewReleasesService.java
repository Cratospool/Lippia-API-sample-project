package services;


import api.model.Albums;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class NewReleasesService extends MethodsService {
    public static Response get(String request){
        return get(request, Albums.class);
    }
}
