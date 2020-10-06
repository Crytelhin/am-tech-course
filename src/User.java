import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private Status status;
    private LocalDate localDate;

    public User() {
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.age = 0;
        this.email = "exemple@mail.ru";
        this.status = Status.NEW;
        this.localDate = LocalDate.now();
    }

    public User(String firstName, String lastName, int age, String email, Status status, LocalDate localDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.status = status;
        this.localDate = localDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return " \n User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", localDate=" + localDate +
                "}";
    }
}
