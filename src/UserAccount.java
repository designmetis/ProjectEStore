
public class UserAccount {
    private String userName;
    private Integer password;
    private Delivery delivery;


    @Override
    public String toString() {
        return "UserAccount{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", delivery=" + delivery +
                '}';
    }
}
