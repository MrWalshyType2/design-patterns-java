package example_strategy.character_weapon_example;

import example_strategy.character_weapon_example.entities.Human;
import example_strategy.character_weapon_example.entities.Zombie;
import example_strategy.character_weapon_example.strategies.BiteStrategy;
import example_strategy.character_weapon_example.strategies.SwordStrategy;
import example_strategy.character_weapon_example.entities.Character;

public class App {

	public static void main(String[] args) {
		Character zombie = new Zombie();
		Character human = new Human();
		
		zombie.setWeaponStrategy(new BiteStrategy());
		human.setWeaponStrategy(new SwordStrategy());
		
		human.fight();
		zombie.fight();
	}

}
