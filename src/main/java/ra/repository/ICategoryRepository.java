package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.Category;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Integer> {
}
