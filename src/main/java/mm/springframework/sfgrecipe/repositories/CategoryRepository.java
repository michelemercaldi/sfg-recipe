package mm.springframework.sfgrecipe.repositories;

import mm.springframework.sfgrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
