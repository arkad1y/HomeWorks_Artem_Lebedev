package com.levelup.lesson1.task4;

public class Note {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public Note() {}
    public Note (String text) { this.text = text; }
}
