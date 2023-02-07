import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal cat;
    Animal dog;

    @BeforeEach
    void setUp() {
        cat = new Animal("Mimi", 3,"Katze","miau");
        dog = new Animal("Bongo",-1,"Hund","wau");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void testAgeSmallerThenZero(){
        assertEquals("Mimi", cat.getName());
        assertEquals(3, cat.getAge());
        assertEquals("Katze", cat.getSpecies());
        assertEquals("miau", cat.getAnimalLoud());

        assertEquals("Bongo", dog.getName());
        assertEquals(0, dog.getAge());
        assertEquals("Hund", dog.getSpecies());
        assertEquals("wau", dog.getAnimalLoud());
    }
    @Test
     void giveAnimalLoud() {
        String expected = "miau";
        Assertions.assertEquals(expected,cat.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        String expectedCat = "Name: Mimi, Alter: 3";
        Assertions.assertEquals(expectedCat,cat.getNameAndAge());

        String expectedDog = "Name: Bongo, Alter: 0";
        Assertions.assertEquals(expectedDog,dog.getNameAndAge());
    }

    @Test
    void ageCategory() {
        String expectedCat = "young animal";
        Assertions.assertEquals(expectedCat,cat.ageCategory());

        String expectedDog = "baby animal";
        Assertions.assertEquals(expectedDog, dog.ageCategory());

        cat.setAge(-4);
        Assertions.assertEquals("baby animal",cat.ageCategory());

        cat.setAge(5);
        Assertions.assertEquals("old animal", cat.ageCategory());
    }
}