import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	private Snake peter;
	private Snake takis;
	
	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}


	

}
