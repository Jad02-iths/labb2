import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.MenuItem;


public class MenuItemAllergyTest {

    // test 1 , en ny meny-rätt ska ha tom allergilista
    @Test
    void newMenuItemShouldHaveNoAllergens() {
        MenuItem item = new MenuItem("Pasta");
        assertTrue(item.getAllergens().isEmpty());
    }

    // test 2, Ska kunna lägga till allergi
    @Test
    void ShouldBeAbleToAddAllergy(){
        MenuItem item = new MenuItem("Pasta");
        item.addAllergen("gluten");

        assertTrue(item.getAllergens().contains("gluten"));
        assertEquals(1, item.getAllergens().size()); 
    }
}