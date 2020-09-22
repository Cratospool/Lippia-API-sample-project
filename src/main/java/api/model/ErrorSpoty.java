package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorSpoty {
    @JsonProperty("error")
    private Analysis error;

    public Analysis getError() {
        return error;
    }

    public void setError(Analysis error) {
        this.error = error;
    }
}
