package yutian.initialization;

/**
 * Created by wuzhenxing on 14/12/26.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor int only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor String arg only, sss = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);

        this.s = s;
        System.out.println("String & int");
    }

    public static void main(String[] args) {
        Flower x = new Flower("a", 1);
    }
}
