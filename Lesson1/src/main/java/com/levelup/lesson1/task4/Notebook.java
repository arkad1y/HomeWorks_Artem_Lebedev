package com.levelup.lesson1.task4;

import java.util.ArrayList;

public class Notebook {

    //ArrayList - автоматически расширяемый "массив".
    private ArrayList notes;

    public Notebook() {
        //Инициализируем список, 0 записей
        notes = new ArrayList<Note>(0);
    }

    //Добавить запись
    public void addNote(String text) {
        notes.add(new Note(text));
    }

    //Удалить запись
    public void removeNote (int index) {
        notes.remove(index);
        notes.trimToSize();
    }

    //Редактировать запись
    public void updateNote (int index, String text) {
        ((Note)notes.get(index)).setText(text);
    }

    //Просмотр всех записей
    public void viewNotes() {
        System.out.println("#\tNote");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(i + "\t" + ((Note)notes.get(i)).getText());
        }
    }
}
