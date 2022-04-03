package Week7;

import java.io.*;
import java.util.List;
import java.util.Arrays;

//тут пока нечего комментировать
public class Bank {
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
        FileOutputStream outputStream = new FileOutputStream("D:\\\\for_lessons\\\\Week7\\\\Users.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

    }

}
