package example_strategy.character_weapon_example.strategies;

public class SwordStrategy implements IWeaponStrategy {

	@Override
	public void useWeapon() {
		System.out.println("Slashed em");
	}

}
