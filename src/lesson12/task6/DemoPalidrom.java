package lesson12.task6;

/**
 * Created by roman_v on 20.06.17.
 */
public class DemoPalidrom {
    public static void main(String[] args) {
        String str =" 123 324 111 4554";
        String[] numb=str.split(" ");
        for (String number:numb) {
            StringBuilder sb=new StringBuilder("123 324 111 4554");
            sb.reverse();
            if(number.equals(sb.toString())){
                System.out.println(number);
            }
        }
    }
}


