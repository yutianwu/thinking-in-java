package yutian.interfaces;

import yutian.polymorphism.Note;

/**
 * Created by wuzhenxing on 14/12/23.
 */

interface Instrument {
    int VALUE = 5;

    void play(Note n);  //interface 中得方法默认都是public
    void adjust();
}

class Wind implements Instrument {
    //方法的实现必须显示地指定为public
    public void play(Note n) {
        System.out.println(this + ".play" + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }
}

public class Music5 {
    public static void main(String[] args) {
        Instrument orchestra = new Wind();

        orchestra.play(Note.MIDDLE_C);
    }
}
