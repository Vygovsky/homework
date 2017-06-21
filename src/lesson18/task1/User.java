package lesson18.task1;

/**
 * Created by roman_v on 21.06.17.
 */
public class User {
    private String login="Makar";
    private String password="115872";
    class Query{
        public void printToLog(){
            System.out.println("User is "+User.this);
            System.out.println("login: "+login);
            System.out.println("password: "+password);
        }

    }
}
