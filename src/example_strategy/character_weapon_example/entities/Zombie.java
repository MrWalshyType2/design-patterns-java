package example_strategy.character_weapon_example.entities;

public class Zombie extends Character {

	@Override
	public void fight() {
		System.out.println("\nThe Zombie is preparing to attack...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		weaponStrategy.useWeapon();
	}

}
