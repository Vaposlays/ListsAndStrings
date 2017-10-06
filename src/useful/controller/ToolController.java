package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList; //Declares the list
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>(); //Initializes the list
		display = new PopupDisplay();
	}
	
	
	public void start()
	{
		Donut temp = new Donut(); //Creates the item "Donut"
		
		donutList.add(temp); 
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "Custard filled";
		
		for(int index = 0;  index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!!!!!");
				}	
			}
			for ( int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut pinkFrostedSprinkled = new Donut("pink frosted sprinkled");
		Donut custardFilled = new Donut("custard filled");
		Donut mapleBar = new Donut("maple bar");
		Donut chocolateOldfashion = new Donut("chocolate old fashion");
		
		donutList.add(jellyFilled);
		donutList.add(pinkFrostedSprinkled);
		donutList.add(custardFilled);
		donutList.add(mapleBar);
		donutList.add(chocolateOldfashion);
	}
}
