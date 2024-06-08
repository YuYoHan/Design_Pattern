package Singleton.ex01;

class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Singleton.singleInstanceHolder.INSTANCE;
    }
}
