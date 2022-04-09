package Week7;


public class DebitCard {
    private double balance;
    private String CardNumber;
    private String endDate;
    private int CVV;

    public DebitCard(Double balance, String cardNumber, String endDate, int cvv) {
        this.balance = balance;
        this.CardNumber = cardNumber;
        this.endDate = endDate;
        this.CVV = cvv;

    }

    @Override
    
    public String toString() {
        return ("Balance: " + balance + "\nCard Number: " + CardNumber + "Expiration date: " + endDate + "Cvv: " + CVV);
    }
    public double getbalance() {
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

    public String getendDate () {
        return endDate;
    }
    public void setendDate (String expDate) {
        this.endDate = expDate;
    }

    public int getCVV () {
        return CVV;
    }
    public void setCVV (int cvv) {
        this.CVV = CVV;
    }


}
