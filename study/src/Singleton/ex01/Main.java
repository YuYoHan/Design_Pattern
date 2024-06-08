package Singleton.ex01;

<<<<<<<< HEAD:study/src/Singleton/ex01/HelloWorld.java

public class HelloWorld {
========
public class Main {
>>>>>>>> 52defc5b5f94875ef387518dac083dacadc11188:study/src/Singleton/ex01/Main.java
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if (a == b) {
            System.out.println(true);
        }
    }
}
