import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    final String login = "login";
    final String email = "email@email.ru";
    User user = new User(login, email);

    @Test
    @DisplayName("Проверка на наличие данных при создании объекта")
    public void createUserTest() {
        String userLogin = user.getLogin();
        String userEmail = user.getEmail();
        Assertions.assertEquals(login, userLogin);
        Assertions.assertEquals(email, userEmail);
    }

    @Test
    @DisplayName("Проверка на отсутствие переданных данных при создании объекта")
    public void createUserNullTest() {
        User user = new User();
        String userLogin = user.getLogin();
        String userEmail = user.getEmail();
        Assertions.assertNull(userLogin);
        Assertions.assertNull(userEmail);
    }

    @Test
    @DisplayName("Проверка корректности Email адреса в поле email")
    public void correctEmailTest() {
        String userEmail = user.getEmail();
        Assertions.assertTrue(userEmail.contains("@") && userEmail.contains("."));
    }

    @Test
    @DisplayName("Проверка на равенство Email адреса в поле email и логина в поле login")
    public void comparisonLoginEmailTest() {
        String userLogin = user.getLogin();
        String userEmail = user.getEmail();
        Assertions.assertNotEquals(userLogin, userEmail);
    }
}
