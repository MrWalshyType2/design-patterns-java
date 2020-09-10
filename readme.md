Java 8
# Design Patterns
- Try avoiding code duplication
- Should not be over-used

# Design Principles
- Identify the dynamic aspects of an application, then encapsulate them away from the static aspects (what stays the same in this context) so the dynamic does not affect the static.
- Program to an interface (program to a super-type), not an implementation. An interface does not have to be the 'interface' construct provided in Java. Programming to a super-type.
- Favour composition over inheritance. Encapsulating related behaviour into separate classes allows runtime modification of behaviour, as long as the composed object implements the correct behaviour interface.

# Strategy pattern
- Favours composition
- Encapsulates related behaviours into separate classes to make them interchangeable.

```
	interface Engine {
		void drive();
		void hasPower();
		void providePower();
		void killPower();
	}
	
	class RotaryEngine implements Engine {
		@Override
		void drive() {
			...
		}
		
		@Override
		void hasPower() {
			...
		}
		
		@Override
		void providePower() {
			...
		}
		
		@Override
		void killPower() {
			...
		}
	}

	abstract class Car {
		// Ref var for the Engine interface (super-type)
		// The engine is interchangeable
		Engine engine;
		
		abstract void displayInfo();
		
		// Behaviour is implemented by the specific engine implementation
		void drive() {
			try {
				if (engine.hasPower()) {
					engine.drive();
				} else {
					System.out.println("Engine has no power");
				}
			} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		
		void providePower() {
			engine.providePower();
		}
		
		void killPower() {
			engine.killPower();
		}
	}
	
	class Mazda extends Car {
		@Override
		void displayInfo(String status) {
			System.out.println("I am a Mazda");
		}
	}
```

# Observer Pattern
- 

# References
- https://journaldev.com
- https://medium.com/educative/the-7-most-important-software-design-patterns-d60e546afb0e
