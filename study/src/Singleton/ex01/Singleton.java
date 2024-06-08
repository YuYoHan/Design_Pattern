package Singleton.ex01;

<<<<<<< HEAD
class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Singleton.singleInstanceHolder.INSTANCE;
    }
=======
public class Singleton {
    private static class singleInstanceHolder {
            private static final Singleton INSTANCE = new Singleton();
        }
        public static Singleton getInstance() {
            return singleInstanceHolder.INSTANCE;
        }
>>>>>>> 52defc5b5f94875ef387518dac083dacadc11188
}
