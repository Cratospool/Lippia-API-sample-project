package services;

import api.model.ErrorSpoty;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ErrorService extends MethodsService {
    public static Response get(String request) {
        return get(request, ErrorSpoty.class);
    }
}