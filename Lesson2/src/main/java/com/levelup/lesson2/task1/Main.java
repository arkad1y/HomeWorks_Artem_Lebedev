package com.levelup.lesson2.task1;

/**
 * Created by arty on 22-Jul-16.
 */
public class Main {
    public static void main(String[] args) {
        Pen greenBallPen1 = new Pen(PenColor.GREEN, PenType.BALL, (float) 10.95);
        Pen greenBallPen2 = new Pen(PenColor.GREEN, PenType.BALL, (float) 10.95);

        Pen greenBallPen3 = greenBallPen1;

        Pen redFountainPen = new Pen(PenColor.RED, PenType.FOUNTAIN, (float) 100.60);

        System.out.println(greenBallPen1.equals(greenBallPen2));
        System.out.println(greenBallPen2.equals(greenBallPen3));
        System.out.println(greenBallPen1.equals(redFountainPen));

        System.out.println(greenBallPen1.hashCode());
        System.out.println(greenBallPen2.hashCode());
        System.out.println(redFountainPen.hashCode());
        System.out.println(redFountainPen);
    }
}
