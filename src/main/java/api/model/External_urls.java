package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class External_urls {
    @JsonProperty("spotify")
    private String spotify;

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }
}
