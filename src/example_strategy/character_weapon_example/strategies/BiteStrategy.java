package example_strategy.character_weapon_example.strategies;

public class BiteStrategy implements IWeaponStrategy {

	@Override
	public void useWeapon() {
		System.out.println("chomped em!");
	}

}
