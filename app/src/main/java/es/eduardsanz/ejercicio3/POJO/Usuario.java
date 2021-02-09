package es.eduardsanz.ejercicio3.POJO;


import com.google.gson.annotations.SerializedName;

public class Usuario {
        private long id;
        @SerializedName("name")
        private String name;
        @SerializedName("username")
        private String username;
        @SerializedName("email")
        private String email;
        private Address address;
        private String phone;
        private String website;
        private Company company;

    public Usuario(long id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public long getID() { return id; }
        public void setID(long value) { this.id = value; }

        public String getName() { return name; }
        public void setName(String value) { this.name = value; }

        public String getUsername() { return username; }
        public void setUsername(String value) { this.username = value; }

        public String getEmail() { return email; }
        public void setEmail(String value) { this.email = value; }

        public Address getAddress() { return address; }
        public void setAddress(Address value) { this.address = value; }

        public String getPhone() { return phone; }
        public void setPhone(String value) { this.phone = value; }

        public String getWebsite() { return website; }
        public void setWebsite(String value) { this.website = value; }

        public Company getCompany() { return company; }
        public void setCompany(Company value) { this.company = value; }
}
