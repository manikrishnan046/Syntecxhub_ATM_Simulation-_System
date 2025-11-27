package Java.ATM_Simulation_System;
import java.util.Scanner;
public class ATMSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     User user = new User("1234", 5000);
     ATM atm = new ATM(user);

     System.out.println("Welcome to ATM!");
     System.out.print("Enter your PIN: ");
     String pin = sc.nextLine();

     if (!atm.startSession(pin)) {
         System.out.println("Incorrect PIN! Access denied.");
         return;
     }

     while (true) {
         System.out.println("---- ATM MENU ----");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdrawal");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");

         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 atm.checkBalance();
                 break;

             case 2:
                 System.out.print("Enter deposit amount: ");
                 double dep = sc.nextDouble();
                 atm.deposit(dep);
                 break;

             case 3:
                 System.out.print("Enter withdrawal amount: ");
                 double wd = sc.nextDouble();
                 atm.withdraw(wd);
                 break;

             case 4:
                 atm.endSession();
                 return;

             default:
                 System.out.println("Invalid choice!");
         }
     }
 }
}