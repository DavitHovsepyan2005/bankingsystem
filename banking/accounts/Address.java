package banking.accounts;

public class Address {
     private String country;
     private String region;
     private String street;
     private String city;
     private String house;

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getHouse() {
        return house;
    }

    public Address(String Country, String Region, String Street, String City, String House){
        this.city=City;
        this.country=Country;
        this.house=House;
        this.region=Region;
        this.street=Street;
    }
}
