package com.company;

public class Main {

    public static void main(String[] args) {
        int cells = 2;
        int hours;
	System.out.println("Амеба через 3 часа поделилась на " + cells + " клетки");
	for (hours = 6; hours <= 24; hours = hours+3) {
	    cells = cells + 2;
	    System.out.println("Через "  + hours + " час. будет " + cells + " амеб");
        }
    }
}
