package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.mkhungo.response.ProductResponse;
import za.co.mkhungo.service.ProductService;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Controller
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/")
    public ResponseEntity<ProductResponse> getProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
