package yutian.polymorphism;

/**
 * Created by wuzhenxing on 14/12/26.
 */

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[0].g();

        ((MoreUseful) x[1]).u();
        //((MoreUseful) x[0]).u();
    }
}
