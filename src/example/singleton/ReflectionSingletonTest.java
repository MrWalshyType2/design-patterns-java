package example.singleton;

import java.lang.reflect.Constructor;

// Reflections (advanced topic) can break the implementation of the single design pattern
// 	- Reflections are used at runtime to access the class path even though it is not accessible at compile time
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitialisation instanceOne = EagerInitialisation.getInstance();
        EagerInitialisation instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialisation.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialisation) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Different hash codes prove that more than one instance is created
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
