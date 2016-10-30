import java.util.Date;

public class Cart {
    private Order order;
    private Long orderId;
    private UserAccount user;





    @Override
    public String toString() {
        return "Cart{" +
                "order=" + order +
                ", orderId=" + orderId +
                ", user=" + user +
                '}';
    }
}
