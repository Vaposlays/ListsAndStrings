package useful.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import useful.controller.ListController;
import useful.model.Donut;
import useful.view.PopupDisplay;
import java.util.ArrayList;

public class TestController
{
	private ListController tested;
	
	@Before
	public void setUp() throws Exception
	{
		tested = new ListController();
	}

	@After
	public void tearDown() throws Exception
	{
		tested = null;
	}

	@Test
	public void testListController()
	{
		assertNotNull("Make sure GUI class is instantiated", tested.getDisplay());
		assertNotNull("Make sure list is instantiated", tested.getDonutList() );
	}

	@Test
	public void testStart()
	{
		tested.start();
		assertTrue("List should have enough data AKA greater than 4", tested.getDonutList().size() > 4);
		
	}

	@Test
	public void testGetDonutList()
	{
		tested.start();
		assertTrue("List must be Typed", tested.getDonutList() instanceof ArrayList<?>);
		assertTrue("Items in list are correct", tested.getDonutList().get(0) instanceof Donut);
	}

	@Test
	public void testGetDisplay()
	{
		assertTrue("GUI Type is correct", tested.getDisplay() instanceof PopupDisplay);
	}

}
