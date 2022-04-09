package Week7;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private List<User> users;
    private final String FILE_NAME = "Users.data";
    BankMenu bankMenu = new BankMenu(this);

    public void start() {
        users = deserializeUsers();
        bankMenu.waiting();
    }

    public User doLogin(String email, String password) {
        for (User user : users) {
            if (user.getEMail().equalsIgnoreCase(email)) {
                if (user.getPassword().equalsIgnoreCase(password)) {
                    System.out.println("Successful authorization!");
                    bankMenu.showBankMenu(user);
                    return user;
                } else {
                    System.out.println("Password is wrong!");
                    bankMenu.showStartMenu();
                }

            } else {
                System.out.println("there is no user with this email");
                bankMenu.showStartMenu();
            }
        }
        return null;
    }

    public void doRegister(User user)  {
        users.add(user);
        serializeUsers(users);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        bankMenu.showBankMenu(user);
    }

    public void addLoan(Loan loan, User user) {
        int num = users.indexOf(user);
        users.get(num).ApproveaCreditToAUser(loan);
        serializeUsers(users);
    }
    public void addDebitCard(DebitCard debitCard, User user) {
        int num = users.indexOf(user);
        users.get(num).ApproveDebitCardToAUser(debitCard);
        serializeUsers(users);
    }


















    public void serializeUsers(List<User> users) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            System.out.println("Successful registration!");
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


    public List<User> deserializeUsers() {
        List<User> users1 = new ArrayList<>();
        while (true) {
            try {
                FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
                users1 = (List<User>) ois.readObject();
                ois.close();
            } catch (FileNotFoundException e) {
                File f = new File(FILE_NAME);
                boolean isCreated = f.exists();
                if (!isCreated) {
                    System.out.println("Can't create file");
                }
                serializeUsers(new ArrayList<User>());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Can't read file");
            } finally {

            }
            return users1;
        }
    }

    public List<User> getUsers() {
        return users;
    }

}
