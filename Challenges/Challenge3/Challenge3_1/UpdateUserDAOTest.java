import org.junit.*;
import static org.junit.Assert.*;

public class UpdateUserDAOTest {
    private UserDAO users;

    @Before
    public void setUp() {
        users = new UserDAO();
    }

    @Test
    public void testUpdate() {
        users.create("Sam", "Fig", "Email", "11/11/2002", "123214", "20");
        users.update("Bob", "Fig", "Email", "11/11/2002", "123214", "20");

        assertEquals("Email should be updated", "Bob", UserDAO.info[0][0]);
    }
}
