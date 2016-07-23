package com.levelup.lesson2.task2;

/**
 * Created by arty on 23-Jul-16.
 */

enum NotebookFormat {A4, A5, A6}

public class Notebook {
    public NotebookFormat getFormat() {
        return format;
    }

    public byte getLettersCount() {
        return lettersCount;
    }

    public float getCost() {
        return cost;
    }

    private NotebookFormat format;
    private byte lettersCount;
    private float cost;

    public Notebook(NotebookFormat format, byte lettersCount, float cost) {
        this.format = format;
        this.lettersCount = lettersCount;
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int result = format.hashCode();
        result = 31 * result + (int) lettersCount;
        result = 31 * result + (cost != +0.0f ? Float.floatToIntBits(cost) : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        if (lettersCount != notebook.lettersCount) return false;
        if (Float.compare(notebook.cost, cost) != 0) return false;
        return format == notebook.format;

    }

}
