package com.benionpackage.state;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Draw A Thick Line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }
}
