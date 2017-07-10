package lesson18.task1;

/**
 * Created by roman_v on 21.06.17.
 */
public class User {
    private String login = "Makar";
    private String password = "115872";

    public void createQuery() {
        Query q = new Query();
        q.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("User is " + User.this);
            System.out.println("login: " + login);
            System.out.println("password: " + password);
        }
    }
    public static void main(String[] args) {
        User user = new User();
        User.Query query = user.new Query();
        //  User.Query query1=
        user.createQuery();
        query.printToLog();
    }
}
