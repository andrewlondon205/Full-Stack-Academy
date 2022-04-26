package pizzarestaurant;

import java.util.*;

public class FourStagioni extends Pizza {
	
		public FourStagioni() {
		
		this.setName("4 Stagioni");
		this.setPrice(8.5);
		
		List <String> ingredients = new ArrayList<>();
		ingredients.add("Pomodoro");
		ingredients.add("Mozzarella");
		ingredients.add("Prosciutto");
		ingredients.add("Funghi");
		ingredients.add("Carciofi");
		this.setIngredients(ingredients);
	}

}
