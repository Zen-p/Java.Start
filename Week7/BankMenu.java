package Week7;



import java.util.Scanner;

public class BankMenu{
    private Bank bank;
    public BankMenu(Bank bank){
        this.bank = bank;
    }

    public void waiting () {
        System.out.println("All operators are currently busy. Please wait...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        showStartMenu();
    }



    public void showStartMenu() {
        Scanner sc = new Scanner(System.in);

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

        //здесь не очень хорошо вызывать в каждом else if метод showBankMenu, так как это рекурсия и при долгой работе приложения
        // возможен stack overflow error. лучше переделать с использованием цикла
        //также необязательно здесь принимать в параметрах User, так как можно для первого if создать еще один метод в Bank и вызывать его
        //это позволит нам изолировать залогиневшегося юзера от класса BankMenu, что очень хорошо
        //методы addLoan и addDebitCard также не нуждаются в параметре user, так как в конце их работы ты передаешь продукт в класс Bank (а там уже есть доступ к залогиневшемуся юзеру)
        public void showBankMenu(User user) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an operation:");
            System.out.println("1. Show my info\n2. Add loan\n3. Add debit card\n0. Exit");
            int operation = sc.nextInt();
            if (operation == 0) {
                System.exit(0);
            } else if (operation == 1){
                System.out.println(user);
                showBankMenu(user);
            } else if (operation == 2) {
                AddALoan(user);
                showBankMenu(user);
            } else if (operation == 3) {
                AddDebitCard(user);
                showBankMenu(user);
            } else {
                System.out.println("Wrong operation selected!");
            }


    }

    private void showLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email:");
        String email = sc.nextLine();

        System.out.print("Enter password:");
        String password = sc.nextLine();

        //здесь нужно проверить что вернулось из метода doLogin, если false то нужно написать что-то юзеру, типа что неправильный пароль
        bank.doLogin(email, password);
        sc.close();
        }
    
    //непонятно зачем тут эта переменная. В остальном все ок в этом классе

    
    public void showRegistration(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter last name:");
        String surname = sc.nextLine();

        System.out.print("Enter date of birth");
        String birthDtae = sc.nextLine();

        System.out.print("Your gender: (man - true, woman - false)");
        Boolean gender = sc.nextBoolean();

        System.out.print("Your email:");
        String g = sc.nextLine();
        String email = sc.nextLine();

        System.out.print("Your password:");
        String password = sc.nextLine();

        User user = new User(name, surname, gender, email, password);
        bank.doRegister(user);
    }

    //методы должны называться с маленькой буквы
    public void AddALoan (User user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter date of loan:");
        String date = sc.nextLine();
        System.out.print("enter the loan amount:");
        Double sum = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("enter the term for which you want to take a loan:");
        int months = sc.nextInt();
        System.out.print("Enter monthly payment: ");
        double monthlyPayment = sc.nextDouble();
        Loan loan = new Loan(date, sum, interestRate, months, monthlyPayment);
        sc.close();
        bank.addLoan(loan, user);

    }

    public void AddDebitCard(User user){
        Scanner sc = new Scanner(System.in);
        System.out.print("card balance:");
        Double balance = sc.nextDouble();
        System.out.print("Enter card number:");
        String s = sc.nextLine();
        String cardNumber = sc.nextLine();
        System.out.print("Enter end date:");
        String endDate = sc.nextLine();
        System.out.println("Enter CVV-code:");
        int cvv = sc.nextInt();
        sc.close();
        DebitCard debitCard = new DebitCard(balance, cardNumber, endDate, cvv);
        bank.addDebitCard(debitCard, user);

    }






}

