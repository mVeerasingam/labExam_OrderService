package ie.atu.labexam;

import java.util.ArrayList;

public class OrderService {
    private Product product;

    ArrayList<Product> products = new ArrayList<>();

    public void createOrder(Product product){
        products.add(product);
        System.out.println("Order Added " + product.getProductId());
    }

    public int getOrderById() {
        return product.getOrderId();
    }
}
