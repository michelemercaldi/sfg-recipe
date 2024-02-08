package mm.springframework.sfgrecipe.services;

import mm.springframework.sfgrecipe.commands.RecipeCommand;
import mm.springframework.sfgrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
