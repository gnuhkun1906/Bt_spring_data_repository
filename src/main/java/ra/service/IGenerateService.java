package ra.service;

import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();
    void  save(T t);
    void remove(int id);
    Optional<T> findById(int id);
}
