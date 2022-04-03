package Week7;

import java.io.Serializable;
import java.util.List;

import java.util.Date;


public class User implements Serializable {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean gender;
    private String email;
    private String password;
    private List<Loan> loanList;
    private List<DebitCard> dbtCardList;

    public User(String name, String surname, Boolean gender, String email, String password) {
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\nSurname: " + surname + "\nBirth Date: " + birthDate + "\nGender: " + gender +
                "\nE-mail: " + email + "\nPassword: " + password + "Loans: " + loanList + "\nDebit Cards: " + dbtCardList);
    }

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }
    public void setSurname (String surname) {
        this.surname = surname;
    }

    public Date getBirthDate () {
        return birthDate;
    }
    public void setBirtDate (Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean getGender () {
        return gender;
    }
    public void setGender (boolean gender) {
        this.gender = gender;
    }

    public String getEMail () {
        return email;
    }
    public void setEMail (String eMail) {
        this.email = eMail;
    }

    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }

    public List<Loan> getLoanList () {
        return loanList;
    }
    public void setLoanList (List<Loan> loanList) {
        this.loanList = loanList;
    }

    public List<DebitCard> getDbtCardList () {
        return dbtCardList;
    }
    public void setDbtCardList (List<DebitCard> dbtCardList) {
        this.dbtCardList = dbtCardList;
    }


}
