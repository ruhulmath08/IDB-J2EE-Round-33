package Question4;

class Test {
    private Demo d;
    void start() {
        d = new Demo();
        this.takeDemo(d);
    }
    void takeDemo(Demo demo) {
        demo = null;
        demo = new Demo();
    }
}
