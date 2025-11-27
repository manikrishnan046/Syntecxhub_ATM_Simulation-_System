package Java.ATM_Simulation_System;

//User / Account Class
class User {
 private String pin;
 private double balance;

 public User(String pin, double balance) {
     this.pin = pin;
     this.balance = balance;
 }

 public boolean verifyPin(String inputPin) {
     return this.pin.equals(inputPin);
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
 }

 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         return true;
     }
     return false;
 }
}
