package api.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Category {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;


    private void setName(String name) {
        this.name = name;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
