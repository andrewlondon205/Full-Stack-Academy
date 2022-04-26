package pizzarestaurant;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza (); 
		List<Pizza> pizzas = new ArrayList <Pizza> (); 
		
		double total_amount = 0.0; 
		int pizzas_amount; 
		
		Scanner input = new Scanner (System.in); 
		System.out.println("How many pizzas do you want?");
		pizzas_amount = Integer.parseInt(input.nextLine()); 
		
		for (int i=0; i< pizzas_amount; i++) { 
			
			System.out.println("Select your preferred pizza"); 
			String pizzaname = input.nextLine();
			
			switch (pizzaname) {
			case "margherita":
				pizza = new Margherita();
				break;

			case "4Stagioni":
				pizza = new FourStagioni();
				break;

			case "diavola":
				pizza = new Diavola();
				break;

			default:
				System.out.println("Pizza not found");
				break;

			}			
			pizzas.add(pizza);
			total_amount += pizza.getPrice();
	}
		
		System.out.println("You want to add a topping? (y/n)");
		String topping_choice = input.nextLine(); 
		switch (topping_choice) { 
			case "s" : 
				Topping topping = new Topping (); 
				topping.addToppingPizza(pizza); 
				break; 		
		}
		System.out.println("Order Review: "); 
		for(Pizza p : pizzas) {
			System.out.println(p); 
		}
		System.out.println("The total amount to be paid is: " + total_amount); 
	}


}


