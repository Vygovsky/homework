package lesson15.task2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by UITS-Admin on 05.07.2017.
 */
public class HeavyBox300 {
    public static void main(String[] args) {
            List<MyHeavyBox> arrayBox = new ArrayList<>();
            arrayBox.add(new MyHeavyBox());
            arrayBox.add(new MyHeavyBox());
            arrayBox.add(new MyHeavyBox());
            arrayBox.add(new MyHeavyBox());
            arrayBox.add(new MyHeavyBox());

        public static List<MyHeavyBox> newHeavyBoxes(List<MyHeavyBox> arrayBox){
            List<MyHeavyBox> arrayBox2=new ArrayList<>();
            Iterator<MyHeavyBox> iterator=arrayBox.iterator();
            while (iterator.hasNext());
            MyHeavyBox elem=iterator.next();
            System.out.println(elem+"  ");
            if(elem.getWeight()>300){
                arrayBox2.add(elem);
                iterator.remove();
            }
            return arrayBox2;

        }

    }
}
