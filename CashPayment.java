package CuaHangTrucTuyen;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán tiền mặt thành công với số tiền: " + String.format("%.0f", amount));
    }
}
