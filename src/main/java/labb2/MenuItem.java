package labb2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    private String name;
    private List<String> allergens;

    public MenuItem(String name) {
        this.name = name;
        this.allergens = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getAllergens() {
        return allergens;
    }

    public void addAllergen(String allergen) {
        if (!allergens.contains(allergen)) {
            allergens.add(allergen);
        }
    }

    public void removeAllergen(String allergen) {
        allergens.remove(allergen);
    }
}
