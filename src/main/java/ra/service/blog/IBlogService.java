package ra.service.blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import ra.model.Blog;
import ra.service.IGenerateService;

import java.util.List;

public interface IBlogService extends IGenerateService<Blog> {
    Page<Blog> findAllBlog(Pageable pageable);
    Page<Blog> findAllByBlogNameContaining(String blogName, Pageable pageable);
;

}
