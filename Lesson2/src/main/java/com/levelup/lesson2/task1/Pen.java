package com.levelup.lesson2.task1;

public class Pen {

    public Pen(PenColor penColor, PenType penType, float cost) {
        this.penColor = penColor;
        this.penType = penType;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    private float cost;

    private PenColor penColor;

    public PenColor getPenColor() {
        return penColor;
    }

    private PenType penType;

    public PenType getPenType() {
        return penType;
    }

    //Тут все понятно. Берем значения, свойств ручки и выводим цвет и тип

    @Override
    public String toString() {
        return "Pen{" +
                "cost=" + cost +
                ", penColor=" + penColor +
                ", penType=" + penType +
                '}';
    }

    //Перегруженные функции equals и hashCode класса Object сгенерировал автоматически при помощи IDE
    /*
    Правило: “если у двух объектов одного и того же класса содержимое одинаковое, то и хеш-коды должны быть одинаковые”.
    Поэтому, при создании пользовательского класса, принято переопределять методы hashCode() и equals() таким образом,
    что бы учитывались поля объекта
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Float.compare(pen.cost, cost) != 0) return false;
        if (penColor != pen.penColor) return false;
        return penType == pen.penType;

    }

    @Override
    public int hashCode() {
        int result = (cost != +0.0f ? Float.floatToIntBits(cost) : 0);
        result = 31 * result + penColor.hashCode();
        result = 31 * result + penType.hashCode();
        return result;
    }
}
