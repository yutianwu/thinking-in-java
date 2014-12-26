package yutian;

/**
 * Created by wuzhenxing on 14-9-24.
 */
public class Test {
    public static void main(String[] args){
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.print(test.str + " and ");
        System.out.print(test.ch);
    }
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};
    public void change (String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}