package com.exercise.exams.other;

public class ExceptionInTryCatchTest {
    public void run() {
        try {
            throw new TestException();
        }
        catch (TestException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
    }
}
