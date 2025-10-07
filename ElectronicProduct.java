package CuaHangTrucTuyen;

public class ElectronicProduct extends Product {
    private String imei;
    private int hanBaoHanh;

    public ElectronicProduct(String productId, String name, double price, String category, String imei, int hanBaoHanh) {
        super(productId, name, price, category);
        this.imei = imei;
        this.hanBaoHanh = hanBaoHanh;
    }

    public String getImei() {
        return imei;
    }

    public int getHanBaoHanh() {
        return hanBaoHanh;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sản phẩm điện tử: " + getName() + " (Mã: " + getProductId() + ")");
        System.out.println("  Giá: " + getPrice() + ", Loại: " + getCategory());
        System.out.println("  IMEI: " + imei + ", Bảo hành: " + hanBaoHanh + " tháng");
    }
}
