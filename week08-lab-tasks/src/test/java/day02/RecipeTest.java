package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testAddIngredient() {
        Recipe recipe = new Recipe("almáspite","Finom");
        recipe.addIngredient("alma","tej","tojás","cukor");
        assertEquals("tej",recipe.getIngredients().get(1));
    }
}