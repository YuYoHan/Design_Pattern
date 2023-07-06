package Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("김민주");
        Product card3 = factory.create("김채원");

        card1.use();
        card2.use();
        card3.use();
    }
}
