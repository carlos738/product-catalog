package dio.digital.innovation.experts.productcatalog.controller;

import dio.digital.innovation.experts.productcatalog.model.Product;
import dio.digital.innovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable("id") Integer id){
        return productRepository.findById(id);
    }

    @RequestMapping
    public Iterable<Product> list(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name){
        return productRepository.findByName(name);
    }
}
