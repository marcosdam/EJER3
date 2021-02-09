package es.eduardsanz.ejercicio3.POJO;

public class Geo {
    private String lat;
    private String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() { return lat; }
    public void setLat(String value) { this.lat = value; }

    public String getLng() { return lng; }
    public void setLng(String value) { this.lng = value; }
}
