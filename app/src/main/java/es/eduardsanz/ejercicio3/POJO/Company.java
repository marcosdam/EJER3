package es.eduardsanz.ejercicio3.POJO;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String value) {
        this.catchPhrase = value;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String value) {
        this.bs = value;
    }

}
