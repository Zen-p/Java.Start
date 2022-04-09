package Week7;

import java.util.Date;

public class Loan {
    private String dateOfIssue;
    private double sum;
    private double interestRate;
    private int creditTerm;
    private double payment;

    public Loan(String date, Double sum, double interestRate, int months, double monthlyPayment) {
        this.dateOfIssue = dateOfIssue;
        this.interestRate = interestRate;
        this.sum = sum;
        this.creditTerm = creditTerm;
        this.payment = payment;
    }

    @Override
    public String toString () {
        return ("Registration Date: " + dateOfIssue + "\nAmount: " + sum + "\nInterest Rate: " + interestRate + "\nTerm: " + creditTerm
                + "\nMonthly Payment: " + payment);
    }

    public String getDateOfIssue () {
        return dateOfIssue;
    }
    public void setDateOfIssue (Date dateOfIssue) {
        this.dateOfIssue = String.valueOf(dateOfIssue);
    }

    public double getsum () {
        return sum;
    }
    public void setsum (double sum) {
        this.sum = sum;
    }

    public double getinterestRate () {
        return interestRate;
    }
    public void setinterestRate (double interestRate) {
        this.interestRate = interestRate;
    }

    public int getcreditTerm () {
        return creditTerm;
    }
    public void setTerm (int creditTerm) {
        this.creditTerm = creditTerm;
    }

    public double getpayment () {
        return payment;
    }
    public void setpayment (double payment) {
        this.payment = payment;
    }



}
