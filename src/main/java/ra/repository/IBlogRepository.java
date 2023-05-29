package ra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.Blog;

import java.util.List;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    // Copntaining : tương đương
    Page<Blog> findAllByBlogNameContaining(String blogName, Pageable pageable);
    List<Blog> findBlogByCategoryId(int CategoryId);
}
