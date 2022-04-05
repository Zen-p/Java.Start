package Week7;

import java.io.*;
import java.util.List;


public class Bank {
    private final String FILE_NAME = "Users.data";
    BankMenu bankMenu = new BankMenu(this);
    private List<User> users;
    public void start() {
        deserializeUsers();
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
        serializeUsers(users);
    }

    public void serializeUsers(List<User> users) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (Exception e){
            System.out.println("Fatal Error");
        }
    }

    public void deserializeUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            users = (List<User>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Can't read file");
        } catch (Exception e) {
            System.out.println("Something is wrong");
        }
    }

}
