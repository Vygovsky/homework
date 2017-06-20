package lesson12.task1;

/**
 * Created by roman_v on 13.06.17.
 */
public class MinNumbString {
    public static void main(String[] args) {
            String [] symbol={" Работа была хорошо встречена публикой и критиками."};
            String symbol2=symbol[0];
        for (int i = 0; i <symbol.length ; i++) {
            System.out.println(symbol[i]+" ");
            if(MinNumCHislo(symbol[i])<MinNumCHislo(symbol2));
            symbol2=symbol[i];
            System.out.println(" ");
            System.out.println("dsfsdfs"+symbol+"dsgfsd"+MinNumCHislo(symbol2));
        }


            //  String l="Найти слово, в котором число различных символов минимально. ";

/*           Matcher m= Pattern.compile("[A-Za-zА-Яа-я0-9]+").matcher(l);
            Set<String> words=new LinkedHashSet<>();
            while (m.find()){
                words.add(l.substring(m.start(),m.end()));
            }
            print(words);
    }

    public static  void  print(Set <String> words){
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void letter(Set <String> words){
        Map<String,Integer> map= new LinkedHashMap<>();
        Set<Character> letters=new HashSet<>();
        for (String word : words) {
            String s=word.toLowerCase();
            for (int i = 0; i <word.length(); i++) {
                letters.add(word.charAt(i));
            }
        }*/
    }

    public static int MinNumCHislo(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String st = String.valueOf(s.charAt(i));
            if (s.length() == -1) {
                sb.indexOf(st);
                sb.append(st);
            }
        }
        return sb.length();
    }
}

