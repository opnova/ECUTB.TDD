
public class main {

    public static void main(String[] args) {

        A AObj = new A();
        B BObj = new B();
        C CObj = new C();
        E EObj = new E();

        BObj.addInterface1Objects(AObj);
        BObj.addInterface1Objects(CObj);
        BObj.addInterface1Objects(EObj);

        BObj.Method1();

    }

}
