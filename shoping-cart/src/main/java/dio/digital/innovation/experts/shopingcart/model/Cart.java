package dio.digital.innovation.experts.shopingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("cart")
public class Cart {
    @Id
    private Integer id;
    private List<Item> items;

    public Cart(){

    }
    public Cart(Integer id){
       this.id  = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
