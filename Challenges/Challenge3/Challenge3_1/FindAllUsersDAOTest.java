import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FindAllUsersDAOTest{


private UserDAO users=new UserDAO();


@Test
public void testFindAll(){
	

	users.create("Sam","Fig","Email","11/11/2002","123214","20");
	users.create("Sam","Fig","Email","11/11/2002","123214","20");
	users.create("Sam","Fig","Email","11/11/2002","123214","20");

	assertEquals("Adding 1 more fruit to list", UserDAO.info.length,UserDAO.findAll().length );

}
}