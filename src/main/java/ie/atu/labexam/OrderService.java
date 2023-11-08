package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private Product product;
    ArrayList<Product> products = new ArrayList<>();

    public boolean createOrder(Product product){
        return products.add(product);
    }

    public int getOrderById(){
        System.out.println(product.getProductId());
        return product.getOrderId();
    }
}
