import java.util.List;
import java.util.Optional;

public class Person {
    private String nume;
    private String phoneNumber;

    public Person(String nume, String phoneNumber) {
        this.nume = nume;
        this.phoneNumber = phoneNumber;
    }

    public String getNume() {
        return nume;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Optional<Person> findPersonByPhoneNumber(String phoneNumber, List<Person> people){
        return people.stream()
                .filter(person -> person.getPhoneNumber().equals(phoneNumber))
                .findFirst();
    }
}
