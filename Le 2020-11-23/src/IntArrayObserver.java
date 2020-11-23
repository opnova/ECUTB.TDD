
public class IntArrayObserver extends Observer {

    IIntArray arr = null;

    public IntArrayObserver(IIntArray arr) {

        this.arr = arr;
    }
    
    @Override
    public void Update() {

        System.out.println("Update()");
        arr.getAverage();
    }

}
