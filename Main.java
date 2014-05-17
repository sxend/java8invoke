public class Main {

    public static void main(String... args) {
        publicStaticMethod();
        privateStaticMethod();
        Main main = new Main();
        main.publicMethod();
        main.privateMethod();
        Runnable runnable1 = () -> {
        };
        runnable1.run();
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {

            }
        };
        runnable2.run();
    }

    public static void publicStaticMethod() {

    }

    private static void privateStaticMethod() {

    }

    public void publicMethod() {

    }

    private void privateMethod() {

    }
}
