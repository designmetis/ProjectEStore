import java.util.Date;
import java.util.List;

public class Order {
    private List<Item> items;
    private Integer amount;
    private Integer sumOrder;
    private Date orderDate;
    private OrderStatus orderStatus;


    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", amount=" + amount +
                ", sumOrder=" + sumOrder +
                ", orderDate=" + orderDate +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
