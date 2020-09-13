package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Albums {
    @JsonProperty("href")
    private String href;
    @JsonProperty("items")
    private item[] items;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("next")
    private String next;
    @JsonProperty("offset")
    private  int offset;
    @JsonProperty("previous")
    private int previous;
    @JsonProperty("total")
    private  int total;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public item[] getItems() {
        return items;
    }

    public void setItems(item[] items) {
        this.items = items;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious() {
        this.previous = Integer.parseInt(null);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
