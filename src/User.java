import java.util.*;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return
                    this.name.compareTo(o.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    public static List<User>
    removeDublicates(List<User>userList){
        Set<User> set = new TreeSet<>(userList);
        return new ArrayList<>(set);
    }
    
    public static User oldestUser(List<User>userList){
        List<User>sortedList = new ArrayList<>(removeDublicates(userList));
        Collections.sort(sortedList);
        return 
        sortedList.get(sortedList.size()-1);        
    }    
}



























