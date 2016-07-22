package com.levelup.lesson1.task4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Notebook notebook = new Notebook();
        notebook.addNote("First note");
        notebook.addNote("Second note");
        notebook.addNote("Third note");
        notebook.addNote("Fourth note");

        notebook.viewNotes();

        notebook.removeNote(3);

        notebook.viewNotes();

        notebook.updateNote(1, "Fifth note");

        notebook.viewNotes();
    }
}
