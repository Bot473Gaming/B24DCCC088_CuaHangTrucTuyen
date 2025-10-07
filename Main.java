package CuaHangTrucTuyen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Product> productCatalog = new ArrayList<>();

    public static void main(String[] args) {
        initializeProductCatalog();

        System.out.println("\nThêm sản phẩm mới:");
        ElectronicProduct newPhone = new ElectronicProduct("EP003", "Điện thoại Xiaomi 13", 18000000, "Điện tử", "IMEI112233", 12);
        productCatalog.add(newPhone);
        FoodProduct newFood = new FoodProduct("FP003", "Bánh quy", 15000, "Thực phẩm", LocalDate.of(2025, 9, 1));
        productCatalog.add(newFood);
        System.out.println("Đã thêm sản phẩm mới vào danh mục.");

        displayProductCatalog();

        System.out.println("\n--- Mô phỏng Thanh toán đơn hàng ---");

        // Order 1: Cash Payment
        System.out.println("\nĐơn hàng của Khách hàng A:");
        Order orderA = new Order("Khách hàng A", new CashPayment());
        orderA.addProduct(findProductById("EP001")); 
        orderA.addProduct(findProductById("FP001")); 
        orderA.checkout();

        // Order 2: Credit Card Payment
        System.out.println("\nĐơn hàng của Khách hàng B:");
        Order orderB = new Order("Khách hàng B", new CreditCardPayment());
        orderB.addProduct(findProductById("EP002"));
        orderB.addProduct(findProductById("FP002"));
        orderB.addProduct(newFood);
        orderB.checkout();

        // Order 3: Momo Payment
        System.out.println("\nĐơn hàng của Khách hàng C:");
        Order orderC = new Order("Khách hàng C", new MomoPayment());
        orderC.addProduct(newPhone);
        orderC.addProduct(findProductById("EP001"));
        orderC.checkout();
    }

    private static void initializeProductCatalog() {
        productCatalog.add(new ElectronicProduct("EP001", "Laptop Dell XPS 15", 35000000, "Điện tử", "IMEI12345", 12));
        productCatalog.add(new ElectronicProduct("EP002", "Điện thoại Samsung S23", 25000000, "Điện tử", "IMEI67890", 6));
        productCatalog.add(new FoodProduct("FP001", "Bánh mì tươi", 20000, "Thực phẩm", LocalDate.of(2025, 7, 15)));
        productCatalog.add(new FoodProduct("FP002", "Sữa tươi Vinamilk", 30000, "Thực phẩm", LocalDate.of(2025, 7, 20)));
    }

    private static void displayProductCatalog() {
        if (productCatalog.isEmpty()) {
            System.out.println("Danh mục sản phẩm trống.");
            return;
        }
        System.out.println("\n--- Danh sách sản phẩm hiện có ---");
        for (Product product : productCatalog) {
            product.displayInfo();
            System.out.println("--------------------");
        }
    }

    private static Product findProductById(String productId) {
        for (Product product : productCatalog) {
            if (product.getProductId().equalsIgnoreCase(productId)) {
                return product;
            }
        }
        return null;
    }
}
