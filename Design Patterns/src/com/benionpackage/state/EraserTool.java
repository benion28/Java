package com.benionpackage.state;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }
}
