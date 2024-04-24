import org.junit.*;
import static org.junit.Assert.*;


public class DeleteUserDAOTest{


private UserDAO users=new UserDAO();


@Test
public void testDelete(){
	

	users.create("Sam","Fig","Email","11/11/2002","123214","20");
	
	users.delete("Email");

	assertEquals("User not found after deletion", 0,UserDAO.findAll().length );

}
}