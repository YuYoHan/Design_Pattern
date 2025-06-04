package Bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
    }
}
