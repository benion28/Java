package com.benionpackage.memento;

/*
package com.benionpackage;

import com.benionpackage.memento.Editor;
import com.benionpackage.memento.History;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var editor = new Editor();
        var history = new History();

        editor.setContent("Abosh");
        history.push(editor.createState());

        editor.setContent("Benion");
        history.push(editor.createState());

        editor.setContent("Benifresh");
        editor.restoreState(history.pop());

        System.out.println("Current State: " + editor.getContent());
    }
}

*/

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restoreState(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
