package com.benionpackage.state;

/*
package com.benionpackage;

import com.benionpackage.state.Canvas;
import com.benionpackage.state.EraserTool;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

*/

public interface Tool {
    void mouseUp();

    void mouseDown();
}
