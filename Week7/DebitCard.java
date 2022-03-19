package Week7;

import java.util.Date;


public class DebitCard {
    private double balance;
    private String CardNumber;
    private Date endDate;
    private int CVV;
    @Override
    public String toString() {
        return ("Balance: " + balance + "\nCard Number: " + CardNumber + "Expiration date: " + endDate + "Cvv: " + CVV);
    }
    public double getBalance() {
        return balance;
    }
    public void balance (double currBalance) {
        this.balance = balance;
    }

    public String getCardNumber () {
        return CardNumber;
    }
    public void setCardNumber (String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public Date getendDate () {
        return endDate;
    }
    public void setendDate (Date expDate) {
        this.endDate = expDate;
    }

    public int getCVV () {
        return CVV;
    }
    public void setCVV (int cvv) {
        this.CVV = cvv;
    }


}
