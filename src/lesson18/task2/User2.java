package lesson18.task1.task2;

import lesson18.task1.task1.User;

/**
 * Created by UITS-Admin on 21.06.2017.
 */
public class User2 {
    private String login="Makar";
    private String password="115872";
    public void createQuery(){
         class Query{
            public void printToLog(){
                System.out.println("User is "+User2.this);
                System.out.println("login: "+login);
                System.out.println("password: "+password);
            }
        }
       Query query=new Query();
        query.printToLog();
    };

    public static void main(String[] args) {
        User user=new User();
        User.Query query= user.new Query();
        //  User.Query query1=
        user.createQuery();
        query.printToLog();
    }
}


