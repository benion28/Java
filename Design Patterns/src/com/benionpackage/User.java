package com.benionpackage;

/*
package com.benionpackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User("Benion");
        user.sayHello();
    }
}

*/

public class User {
    // Fields (Attributes)
    public String name;

    // Constructor
    User(String name) {
        System.out.println("<<<<<< User Object Constructed >>>>");
        System.out.println();
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hello, from " + name);
    }
}
