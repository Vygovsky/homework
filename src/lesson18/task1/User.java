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
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        User.Query query2 = new User().new Query();
        query2.printToLog();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
* Создать класс User, содержащий private переменные login, password. Создать внутренний класс
 * Query в классе User. Класс Query содержит метод printToLog(), который распечатывает на консоль
  * сообщение о том что пользователь с таким то логином и паролем отправил запрос. Класс User,
  * содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
   * В методе main(): создать экземпляр класса User и вызвать метод createQuery(); создать экземпляр класс
    * Query и вызвать метод printToLog() используя конструкцию user.new Query(); создать экземпляр класса Query
     * и вызвать метод printToLog() используя конструкцию new User().new Query();
* */