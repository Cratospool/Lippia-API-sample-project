package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class item {
    @JsonProperty("album_type")
    private String album_type;
    @JsonProperty("artists")
    private Artist[] artists;
    @JsonProperty("available_markets")
    private String[] available_markets;
    @JsonProperty("external_urls")
    private External_urls external_urls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private Image[] images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("release_date")
    private String release_date;
    @JsonProperty("release_date_precision")
    private String release_date_precision;
    @JsonProperty("total_tracks")
    private int total_tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    public String[] getAvailable_markets() {
        return available_markets;
    }

    public void setAvailable_markets(String[] available_markets) {
        this.available_markets = available_markets;
    }

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

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRelease_date_precision() {
        return release_date_precision;
    }

    public void setRelease_date_precision(String release_date_precision) {
        this.release_date_precision = release_date_precision;
    }

    public int getTotal_tracks() {
        return total_tracks;
    }

    public void setTotal_tracks(int total_tracks) {
        this.total_tracks = total_tracks;
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
}
