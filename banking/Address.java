package banking;

public class Address {
     String Country;
     String Region;
     String Street;
     String City;
     String House;

    public Address(String Country, String Region, String Street, String City, String House){
        this.City=City;
        this.Country=Country;
        this.House=House;
        this.Region=Region;
        this.Street=Street;
    }
}
