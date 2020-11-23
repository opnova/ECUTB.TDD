
public class IntArray extends Subject implements IIntArray {

    @Override
    public double getAverage() {

        System.out.println("getAverage()");
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int[] findPositions(int val) {

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void appendLast(int value) {

        System.out.println("appendLast()");
        Notify();

    }

    @Override
    public void insertAt(int pos, int value) {

        System.out.println("insertAt()");
        Notify();

    }

    @Override
    public int getAt(int pos) {

        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setAt(int pos, int element) {

        System.out.println("setAt()");
        Notify();

    }

    @Override
    public int deleteAt(int pos) {

        System.out.println("deleteAt()");
        Notify();

        return 0;
    }

}
