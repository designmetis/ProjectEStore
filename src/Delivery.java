
public class Delivery {
    private String name;
    private String surname;
    private Integer telephone;
    private String country;
    private String city;
    private String street;
    private Integer house;


    @Override
    public String toString() {
        return "Delivery{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephone=" + telephone +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
