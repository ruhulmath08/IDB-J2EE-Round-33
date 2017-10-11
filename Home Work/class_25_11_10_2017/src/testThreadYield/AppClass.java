package testThreadYield;

public class AppClass {
    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");
    }
}
