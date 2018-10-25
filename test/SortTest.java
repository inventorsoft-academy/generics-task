package test;

public class SortTest {
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


}


