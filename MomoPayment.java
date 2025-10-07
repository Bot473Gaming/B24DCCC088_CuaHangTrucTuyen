package CuaHangTrucTuyen;

public class MomoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng ví điện tử Momo thành công với số tiền: " + amount);
    }
}
