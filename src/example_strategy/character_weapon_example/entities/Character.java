package example_strategy.character_weapon_example.entities;

import example_strategy.character_weapon_example.strategies.IWeaponStrategy;

public abstract class Character {

	IWeaponStrategy weaponStrategy;
	
	public Character() {
		
	}

	public void setWeaponStrategy(IWeaponStrategy weaponStrategy) {
		this.weaponStrategy = weaponStrategy;
	}
	
	public abstract void fight();
}
