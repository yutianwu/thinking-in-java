package yutian;

/**
 * Created by wuzhenxing on 14/12/23.
 */
class StaticSuper {
    public static String staticGet() {
        return "Basic staticGet";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
    }
}