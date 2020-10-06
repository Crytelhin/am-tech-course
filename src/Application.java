import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Alex", "Petrov", 18, "SashaPetrov@mail.ru", Status.NEW, LocalDate.now()),
                new User("John", "Smith", 16, "JohnSmith@gmail.com", Status.INACTIVE, LocalDate.of(2020, 5, 10)),
                new User("Ada", "Brown", 21, "AdaBrown@gmail.com", Status.NEW, LocalDate.of(2020, 6, 9)),
                new User("Lora", "Merg", 17, "LoraMerg@gmail.com", Status.ACTIVE, LocalDate.of(2020, 4, 3))
        );
        System.out.println("List");
        System.out.println(users);

        UserService userService = new UserService();
        userService.updateFromNewToActive(users);

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("List after updating status from new to active for accounts with timestamp more than 1 day");
        System.out.println(users);

        userService.updateFromInactiveToBlocked(users);

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("List after updating status from inactive to blocked for accounts with timestamp more than 1 month");
        System.out.println(users);
    }
}
