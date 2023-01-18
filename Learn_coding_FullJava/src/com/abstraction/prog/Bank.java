package com.abstraction.prog;

import java.util.Scanner;

abstract class Bank {
    public String Name = "icici";
    public String IFSC = "icici000267";

    public void BankDetails() {

        System.out.println("Bank Name" + Name + " IFSC Code " + IFSC);
    }
//When ever the action is common but implementation are different
    //then we should use abstract method
    abstract void Deposite();
    abstract void withdraw();
    abstract void checkbal();

}

class bankservice extends Bank {

    private double bal = 5000;
    private int pwd;
    public double money;

    @Override
    void Deposite() {
        System.out.println("Enter your password");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();

        if (pwd == 123) {

            System.out.println("Enter amont to deposite");
            money=sc.nextDouble();
            bal = bal + money;

            System.out.println("Diposited money" + money);
            System.out.println("Diposited money" + bal);
        } else {

            System.out.println("Invalid Password");
        }

    }

    @Override
    void withdraw() {
        System.out.println("Enter your password");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();

        if (pwd == 123) {
            System.out.println("Enter amont to withdraw");
            money=sc.nextDouble();

            bal = bal - money;

            System.out.println("Diposited money" + money);
            System.out.println("Diposited money" + bal);
        } else {

            System.out.println("Invalid Password");
        }

    }

    @Override
    void checkbal() {

        System.out.println("Enter your password");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();

        if (pwd == 123) {

            System.out.println("Total balance is " + bal);

        }

    }
}
    class customer {
        public static void main(String[] args) {

            bankservice b = new bankservice();
            b.BankDetails();

            int ch;

            System.out.println("1 Diposite");
            System.out.println("2 Withdraw");
            System.out.println("3 Checkbalance");

            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    b.Deposite();
                    break;

                case 2:
                    b.withdraw();
                    break;

                case 3:
                    b.checkbal();
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }

    }
