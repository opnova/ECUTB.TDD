import java.util.ArrayList;

public class B {

    ArrayList<Interface1> ifList = null;
    D dObject = null;

    public B() {

        ifList = new ArrayList<Interface1>();
        dObject = null;
    }

    public void addInterface1Objects(Interface1 instance) {

        ifList.add(instance);
    }

    void registerDObject(D dObj) {

        dObject = dObj;
    }

    public int Method1() {

        for (Interface1 i1 : ifList) {
            i1.Method1();
        }
        return 0;
    }

}
