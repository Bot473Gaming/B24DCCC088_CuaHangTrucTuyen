package CuaHangTrucTuyen;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Product> products;
    private PaymentMethod paymentMethod;
    private double totalAmount;

    public Order(String customerName, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
        this.paymentMethod = paymentMethod;
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalAmount += product.getPrice();
    }

    public double calculateTotal() {
        return totalAmount;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + String.format("%.2f", totalAmount));
        paymentMethod.pay(totalAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
