package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Followers {
    @JsonProperty("href")
    private String href;
    @JsonProperty("total")
    private int total;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
