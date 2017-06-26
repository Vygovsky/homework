package lesson14.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roman_v on 26.06.17.
 */
public class MyCollection {
    public static void main(String[] args) {
        List<MyHeavyBox> arrayList1 = new ArrayList<>();

        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        arrayList1.add(new MyHeavyBox());
        for (MyHeavyBox hb : arrayList1) {
            System.out.println("Res myHeavyBox "+hb);
        }
    }
}

