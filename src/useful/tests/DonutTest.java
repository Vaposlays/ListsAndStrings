package useful.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import useful.model.Donut;

public class DonutTest
{
	private Donut testedDonut;
	
	@Before
	public void setUp() throws Exception
	{
		testedDonut = new Donut();
	}

	@After
	public void tearDown() throws Exception
	{
		testedDonut = null;
	}

	@Test
	public void testDonut()
	{
		assertTrue("Default shape is incorrect", testedDonut.getShape().equals("round"));
	}

	@Test
	public void testDonutString()
	{
		String testFlavor = "dark chocolate coffee";
		testedDonut = new Donut(testFlavor);
		assertTrue("Assignment not working properly", testedDonut.getFlavor().equals(testFlavor));
	}

	@Test
	public void testToString()
	{
		assertFalse("The toString method is not written properly.", testedDonut.toString().contains("@"));
	}

	@Test
	public void testGetShape()
	{
		assertNotNull("Shape not initialized", testedDonut.getShape());
		assertTrue("Default shape name is not long enough", testedDonut.getShape().length() > 4);
	}

	@Test
	public void testSetShape()
	{
		String testShape = "non-euclidean";
		testedDonut.setShape(testShape);
		assertTrue("Default flavor set incorrectly", testedDonut.getShape().equals(testShape));
	}

	@Test
	public void testGetFlavor()
	{
		assertNotNull("Flavor not initialized", testedDonut.getFlavor());
		assertTrue("Default flavor set incorrectly", testedDonut.getFlavor().equals("plain"));
		assertTrue("Default flavor name is not long enough", testedDonut.getFlavor().length() > 4);
	}

}
