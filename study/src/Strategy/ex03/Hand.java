package Strategy.ex03;

public enum Hand {
    // 가위, 바위, 보를 내타내는 세 개의 enum 상수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum이 가진 필드
    private String name;            // 가위, 바위, 보의 이름
    private int value;              // 가위, 바위, 보의 값

    // 손의 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    Hand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }

    // 손의 값으로 enum 상수를 가져온다.
    public static Hand getHand(int value) {
        return hands[value];
    }

    // this가 h보다 강할 때 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }


    // 무승부는 0, this가 이기면 1, h가 이기면 -1
    private int fight(Hand h) {
        if(this == h) {
            return 0;
        } else if((this.value + 1) % 3 == h.value) {
            return 1;
        } else {
            return -1;
        }
    }


}
