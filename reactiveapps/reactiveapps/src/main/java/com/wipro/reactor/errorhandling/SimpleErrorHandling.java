package com.wipro.reactor.errorhandling;

public class SimpleErrorHandling {
    private static String doSomething(int i) {
        // System.out.println(i);
        if (i == 5) {
            throw new RuntimeException("something went wrong!!!");
        }
        return Integer.toString(i);
    }
    public static void main(String[] args) {
        //legacy code
        try {
            for (int i = 1; i < 10; i++) {
                String v1 = doSomething(i);
                System.out.println(v1);
            }

        } catch (Throwable a) {
            System.out.println("CAUGHT" + a);
        }
    }
}
