package com.company;

public class Main {

    public static void main(String[] args) {
        Comparable[] x = {1,5,5,5,7,8,8,8,9,11,12,12,15};

        bonus bonus = new bonus(); // Bonus tasks

        System.out.println(bonus.firstIndexOf(x, 8)); // 1 esep

        System.out.println(bonus.secondIndexOf(x, 8)); // 2 esep

        System.out.println(bonus.lastIndexOf(x,8)); // 3 esep

        System.out.println(bonus.has(x, 23)); // 4 esep

        System.out.println(bonus.hasTriple(x,35)); // 5 esep
    }
}
