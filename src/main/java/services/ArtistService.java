package services;

import api.model.Artist;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ArtistService extends MethodsService {
    public static Response get(String request) {
        return get(request, Artist.class);
    }
}
