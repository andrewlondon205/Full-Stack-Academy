package pizzarestaurant;
import java.util.*;

public class Diavola extends Pizza {
	
	public Diavola() {
		
		this.setName("Diavola");
		this.setPrice(7);
		
		List<String> ingredients = new ArrayList <>(); 
		ingredients.add("Pomodoro");
		ingredients.add("Bufala");
		ingredients.add("Nduja");
		ingredients.add("Peperoncino"); 
		this.setIngredients(ingredients);
		// TODO Auto-generated constructor stub
	}

}
