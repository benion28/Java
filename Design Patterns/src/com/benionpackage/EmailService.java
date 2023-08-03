package com.benionpackage;

/*
package com.benionpackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var emailService = new EmailService();
        emailService.sendEmail();
    }
}

*/

public class EmailService {
    public void sendEmail() {
        connect();
        authenticate();
        // Send Email
        disconnect();
    }

    private void connect() {
        System.out.println("Connected Successfully");
    }

    private void authenticate() {
        System.out.println("Authenticated Successfully");
    }

    private void disconnect() {
        System.out.println("Disconnected Successfully");
    }
}
