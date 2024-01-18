package mm.springframework.sfgrecipe.repositories;

import mm.springframework.sfgrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
