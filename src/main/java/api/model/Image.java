package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
    @JsonProperty("height")
    private int height;
    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
