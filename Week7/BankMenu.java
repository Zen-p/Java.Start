package Week7;



import java.util.Scanner;

public class BankMenu{
    private Bank bank = null;
    public BankMenu() {
        this.bank = bank;
    }

    public void showStartMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("All operators are currently busy. Please wait...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello. I am your personal assistant.");
        System.out.println("Select one:\n1.Login\n2.Register\n0.Exit");


        int logOrReg = sc.nextInt();
        if (logOrReg == 1) {
            showLogin();
        } else if (logOrReg == 2) {
            showRegistration();
        } else {
            System.out.println("Wrong operation selected!");
        }
        sc.close();
    }

        public void showBankMenu() {
            System.out.println("1. Show my info\n2. Add loan\n3. Add debit card\n0. Exit");
        }

    private void showLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email:");
        String email = sc.nextLine();
        System.out.print("Enter password:");
        String password = sc.nextLine();
        bank.doLogin(email, password);
        sc.close();
        }
    private User user;
    private void showRegistration(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter last name:");
        String surname = sc.nextLine();
        System.out.println("Enter date of birth");//Я не понимаю как ввести дату с клавиатуры
        System.out.print("Your gender:(man - true, woman - false)");
        Boolean gender = sc.nextBoolean();
        System.out.print("Your email:");
        String g = sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Yor password:");
        String password = sc.nextLine();
        User user = new User(name, surname, gender, email, password);
        bank.doRegister(user);
    }
}

