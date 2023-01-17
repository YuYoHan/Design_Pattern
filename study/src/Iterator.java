public interface Iterator {
    // Iterator을 통해서 Aggregator의 다음 구성 데이터를 얻을 수 있게하고
    // 얻을 수 있으면 true, 없으면 false
    boolean next();
    // 구성 데이터를 하나 얻어 반환하는데
    // Object 타입으로 반환한다.
    Object current();
}
