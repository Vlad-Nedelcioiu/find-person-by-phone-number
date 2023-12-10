import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrei","0712345678"));
        people.add(new Person("Marian","0787654321"));
        people.add(new Person("Gheorghe","0765412378"));
        people.add(new Person("Marius","0765415621"));

        String phoneNumberToFind = "0765412378";
        Optional<Person> foundPerson = Person.findPersonByPhoneNumber(phoneNumberToFind,people);

        if(foundPerson.isPresent()){
            System.out.println("Persoana cu numarul de telefon " + phoneNumberToFind +
                    " este " + foundPerson.get().getNume());
        } else {
            System.out.println("Persoana cu numarul de telefon " + phoneNumberToFind +
                    " nu a fost gasita!");
        }

    }
}