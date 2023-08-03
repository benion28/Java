package com.benionpackage.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Draw A Dashed Rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }
}
