package com.benionpackage;

/*
package com.benionpackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var account = new Account();
        account.deposit(100);
        account.withdraw(80);
        System.out.println("Balance: " + account.getBalance());
    }
}

*/

public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            balance -= amount;
    }

    public  float getBalance() {
        return balance;
    }
}
