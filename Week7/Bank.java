package Week7;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Bank {
    private Object User;

    public void start() {
        BankMenu bankMenu = new BankMenu();
        bankMenu.showStartMenu();
    }
    public Boolean doLogin(String email, String password) {
        return true;
    }
    public void doRegister(User user){

    }

    void serializeUsers(List<User> users) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Users.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(User);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
