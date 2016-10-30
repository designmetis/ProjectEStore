
public class Item {
    private String itemName;
    private String venderName;
    private Integer price; // may be BigDecimal
    private Long itemsId;




    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", venderName='" + venderName + '\'' +
                ", price=" + price +
                ", itemsId=" + itemsId +
                '}';
    }
}
