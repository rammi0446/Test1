//Ramandeep  Kaur
//C0736211


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
	public void testHealthy() {
		
		
		//check is healthy funtion is working 
		boolean healthy = takis.isHealthy();
		assertEquals(true, healthy);
		System.out.println("takis is healthy");
		
		boolean nothealthy = peter.isHealthy();
		assertEquals(false, nothealthy);
		System.out.println("peter is unhealthy");
			
		//cage length > snake length
		boolean fitcage1 = peter.fitsInCage(12);
		assertEquals(true,fitcage1);
		System.out.println("peter fits in cage");
		
		//cage length < snake length
		boolean fitcage2 = takis.fitsInCage(45);
		assertEquals(false,fitcage2);
		System.out.println("takis not fits in cage");
		
		//cage length = snake length
				boolean fitcage3 = peter.fitsInCage(10);
				assertEquals(true,fitcage1);
				System.out.println("peter fits in cage");
		
	}
	
	

	

}
