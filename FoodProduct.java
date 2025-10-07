package CuaHangTrucTuyen;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate hanSuDung;

    public FoodProduct(String productId, String name, double price, String category, LocalDate hanSuDung) {
        super(productId, name, price, category);
        this.hanSuDung = hanSuDung;
    }

    public LocalDate getHanSuDung() {
        return hanSuDung;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sản phẩm thực phẩm: " + getName() + " (Mã: " + getProductId() + ")");
        System.out.println("  Giá: " + getPrice() + ", Loại: " + getCategory());
        System.out.println("  Hạn sử dụng: " + hanSuDung);
    }
}
