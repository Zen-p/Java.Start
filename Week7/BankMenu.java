package Week7;

import java.util.Scanner;

public class BankMenu {
    private Bank bank;

    public BankMenu(Bank bank) {
        this.bank = bank;
    }

    public void showStartMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:\n1.Вход\n2.Регистрация");

        int logOrReg = sc.nextInt();
        if (logOrReg == 1) {
            showLogin();
        } else if (logOrReg == 2) {
            showRegistration();
        } else {
            System.out.println("Выбрана неверная операция!");
        }
    }

        public void showBankMenu() {
            System.out.println("1. Show my info\n2. Add loan\n3. Add debit card\n0. Exit");
        }

    private void showLogin(){

        }

    private void showRegistration(){

        }


    }

