package fed.spring_clean.service;

import fed.spring_clean.model.Course;
import fed.spring_clean.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {

    private final CourseRepository repository;

    public CourseService(CourseRepository courseRepository) {
        this.repository = courseRepository;
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public List<Course> list() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
