package Bridge;

// Display 클래스에 기능을 추가한 것이 해당 클래스
// Display에는 표시하는 기능 밖에 없었는데 해당 클래스에서 지정 횟수만큼 표시하는 기능을 추가
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
