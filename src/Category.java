import java.util.List;

public class Category {
    private String name;
    private Integer categoruId;
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
