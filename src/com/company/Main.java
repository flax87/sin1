package com.company;

public class Main {

    public static void main(String[] args) {


        // Рахуємо площу  фрагмента синусоїди
            double finish = Math.PI;
            double deltaX = 0.01;
            double y = 0.1;                                                          // день народження 01 червня
            double rectangle;
            double area = 0;

            for (double x = 0; x < finish; x += deltaX) {

                if (Math.sin(x) <= y) {
                    rectangle = Math.sin(x) * deltaX;
                } else {
                    rectangle = y * deltaX;
                }
                area += rectangle;
            }
            System.out.println(area);
    }
}
