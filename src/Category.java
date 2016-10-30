import java.util.List;

public class Category {
    private String name;
    private Long categoruId;
    private List<Item> items;


    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoruId=" + categoruId +
                ", items=" + items +
                '}';
    }
}
