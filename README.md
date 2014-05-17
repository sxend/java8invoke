久々にjavapしてみた

$ ./main.sh

```
execute: cat Main.java
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
execute: javac Main.java
execute: javap -c Main
Compiled from "Main.java"
public class Main {
  public Main();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String...);
    Code:
       0: invokestatic  #2                  // Method publicStaticMethod:()V
       3: invokestatic  #3                  // Method privateStaticMethod:()V
       6: new           #4                  // class Main
       9: dup
      10: invokespecial #5                  // Method "<init>":()V
      13: astore_1
      14: aload_1
      15: invokevirtual #6                  // Method publicMethod:()V
      18: aload_1
      19: invokespecial #7                  // Method privateMethod:()V
      22: invokedynamic #8,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
      27: astore_2
      28: aload_2
      29: invokeinterface #9,  1            // InterfaceMethod java/lang/Runnable.run:()V
      34: new           #10                 // class Main$1
      37: dup
      38: invokespecial #11                 // Method Main$1."<init>":()V
      41: astore_3
      42: aload_3
      43: invokeinterface #9,  1            // InterfaceMethod java/lang/Runnable.run:()V
      48: return

  public static void publicStaticMethod();
    Code:
       0: return

  public void publicMethod();
    Code:
       0: return
}
execute: javap -c Main\$1
Compiled from "Main.java"
final class Main$1 implements java.lang.Runnable {
  Main$1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public void run();
    Code:
       0: return
}
```