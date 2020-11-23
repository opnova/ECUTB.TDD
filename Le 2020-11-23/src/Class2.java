
public class Class2 {

    Class1 c1;

    public Class2(Class1 c1) {

        this.c1 = c1;
    }

    public void compute() {

        System.out.println("compute()");
        c1.update();
    }

}