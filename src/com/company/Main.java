package com.company;

public class Main {

    public static void main(String[] args) {

        StringReverse stringReverse = new StringReverse();
        System.out.println(stringReverse.reverse("kristen"));

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);

        DBConnectionPooling dbConnectionPooling = DBConnectionPooling.getInstance();
    }
}
