import java.time.LocalDate;
import java.util.List;

public class UserService {
    public void updateFromNewToActive(List<User> users) {
        for (User user : users) {
            if (user.getStatus() == Status.NEW) {
                LocalDate yesterday = LocalDate.now().minusDays(1);
                if (yesterday.compareTo(user.getLocalDate()) > 0) {
                    user.setStatus(Status.ACTIVE);
                }
            }
        }
    }

    public void updateFromInactiveToBlocked(List<User> users) {
        for (User user : users) {
            if (user.getStatus() == Status.INACTIVE) {
                LocalDate yesterday = LocalDate.now().minusMonths(1);
                if (yesterday.compareTo(user.getLocalDate()) > 0) {
                    user.setStatus(Status.BLOCKED);
                }
            }
        }
    }
}
