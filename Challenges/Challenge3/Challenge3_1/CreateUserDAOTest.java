import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CreateUserDAOTest{


private UserDAO users=new UserDAO();


@Test
public void testCreate(){
	

	users.create("Sam","Fig","Email","11/11/2002","123214","20");
	assertEquals("Adding users to database", UserDAO.info.length,2 );

}


@Test
public void testCreate2(){

	users.create("Sam","Fig","Email","11/11/2002","123214","20");
	assertEquals("Checking if values match", UserDAO.info[0][0],"Sam" );
	assertEquals("Checking if values match", UserDAO.info[0][1],"Fig" );
	assertEquals("Checking if values match", UserDAO.info[0][2],"Email" );
	assertEquals("Checking if values match", UserDAO.info[0][3],"11/11/2002" );
	assertEquals("Checking if values match", UserDAO.info[0][4],"123214" );
	assertEquals("Checking if values match", UserDAO.info[0][5],"20" );

}
}