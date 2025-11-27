package labb2;

public class Booking {
    private PaymentStatus paymentStatus;

    public Booking(){
        this.paymentStatus = PaymentStatus.UNPAID;
    }

    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }

    public void pay(){
        if(this.paymentStatus == PaymentStatus.PAID){
            throw new IllegalStateException("Booking is already paid");
        }
        this.paymentStatus = PaymentStatus.PAID;
    }
}
