package Bridge;

// 구현 클래스
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    void rawOpen() {
        printLine();
    }

    @Override
    void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
