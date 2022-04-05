package Week7;

import java.io.*;
import java.util.List;


public class Bank {
    private final String FILE_NAME = "Users.data";
    BankMenu bankMenu = new BankMenu(this);
    private List<User> users;

    public void users (List<User> users) {
        this.users = users;
    }

    public void start() {
        bankMenu.showStartMenu();
    }
    public Boolean doLogin(String email, String password) {
        for (User user : users) {
            if (user.getEMail() == email && user.getPassword() == password) {
                return true;
            }
        }
        return false;
    }

    public void doRegister(User user)  {
        users.add(user);
        try {
            serializeUsers(users);
        } catch (NullPointerException e){
            System.out.println("Something is wrong");
        }


    }
    public Bank bank;
    public void serializeUsers(List<User> users) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
            oos.close();
        } catch (Exception e){
            System.out.println("Fatal Error");
        } finally {

        }
    }

    public void deserializeUsers() {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            List<User> user = (List<User>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println("Can't read file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }

}
