
public class MyIntArray extends XStatistics<Integer> {

    int[] data = null;

    @Override
    Integer getFirst() {

        return 0;
    }

    @Override
    Integer getNext() {

        return 0;
    }

    @Override
    boolean hasMore() {

        return false;
    }

    @Override
    boolean isLargerThan(Integer i1, Integer i2) {

        return false;
    }

}
