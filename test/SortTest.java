package test;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparable<User> {
    String firstname;
    String lastname;

    User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public int compareTo(User o) {
        return firstname.compareTo(o.firstname);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}

public class SortTest {

    public static void main(String[] args) {
        List<User> list = Arrays.asList(new User("Adam", "Smith"), new User("Bill", "Murray"));
        Comparator<User> firstNameComparator = (first, last) -> first.firstname.compareTo(last.firstname);
        Comparator<User> lastNameComparator = (first, last) -> first.lastname.compareTo(last.lastname);

        Collections.sort(list, lastNameComparator.thenComparing(firstNameComparator));
        System.out.println(list);
    }
}
}
