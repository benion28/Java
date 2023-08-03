package com.benionpackage;

/*
package com.benionpackage;

public class Main {

    public static void main(String[] args) {
        // write your code here
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
*/

public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }

    public abstract void draw();
}
