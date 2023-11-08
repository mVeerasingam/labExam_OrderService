package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService os;

    @Autowired
    public OrderController(OrderService os) {
        this.os = os;
    }

    @PostMapping("/createOrder")
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody Product product){
        os.createOrder(product);
        return "Order Placed";
    }

    @GetMapping("/getOrder")
    public Object getOrder(){
        return os.getOrderById();
    }
}
