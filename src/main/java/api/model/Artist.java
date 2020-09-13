package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

    @JsonProperty("external_urls")
    private External_urls external_urls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id;")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;

    public External_urls getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(External_urls external_urls) {
        this.external_urls = external_urls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("uri")
    private String uri;
}
