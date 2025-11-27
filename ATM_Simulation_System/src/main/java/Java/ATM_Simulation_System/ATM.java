package Java.ATM_Simulation_System;
class ATM {
    private User user;
    private boolean sessionActive;

    public ATM(User user) {
        this.user = user;
        this.sessionActive = false;
    }

    // PIN verification
    public boolean startSession(String pin) {
        if (user.verifyPin(pin)) {
            sessionActive = true;
            return true;
        }
        return false;
    }

    public void endSession() {
        sessionActive = false;
        System.out.println("Session Ended. Thank you!");
    }

    public void checkBalance() {
        System.out.println("Your balance: ₹" + user.getBalance());
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        user.deposit(amount);
        System.out.println("Deposit successful! New balance: ₹" + user.getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (user.withdraw(amount)) {
            System.out.println("Withdrawal successful! New balance: ₹" + user.getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
