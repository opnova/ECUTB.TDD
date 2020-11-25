import java.util.ArrayList;

public class D {

    ArrayList<B> list = null;

    public D(B bObj) {

        list = new ArrayList<B>();
        list.add(bObj);
        bObj.registerDObject(this);
    }

    public int Method1() {

        return 0;
    }

}
