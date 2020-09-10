package example_strategy.character_weapon_example.entities;

public class Human extends Character {

	@Override
	public void fight() {
		System.out.println("I will never be defeated by man, woman or creature... attack!");
		weaponStrategy.useWeapon();
	}

}
