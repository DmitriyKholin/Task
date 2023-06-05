import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User>userList = new ArrayList<>();
        userList.add(new User("John", 30));
        userList.add(new User("Mary", 50));
        userList.add(new User("John", 30));
        userList.add(new User("Bob", 45));

        User oldestUser = User.oldestUser(userList);
        System.out.println("Name: " + oldestUser.getName() + ", Age: " + oldestUser.getAge());

    }
}