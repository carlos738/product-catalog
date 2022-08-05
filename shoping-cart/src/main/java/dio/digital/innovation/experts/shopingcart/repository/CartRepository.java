package dio.digital.innovation.experts.shopingcart.repository;

import dio.digital.innovation.experts.shopingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    Cart findByCustomerId(Integer customerId);
}
