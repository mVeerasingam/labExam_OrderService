package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int orderId;
    private int productId;
    private int quantity;
    private  int customerId;
}
