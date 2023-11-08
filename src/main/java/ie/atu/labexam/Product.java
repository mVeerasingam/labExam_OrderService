package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;
}
