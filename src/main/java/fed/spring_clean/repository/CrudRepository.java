package fed.spring_clean.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();
}
