package fed.spring_clean.repository;

import fed.spring_clean.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1,
                "Getting Started with Spring Boot 2",
                "Learn how to build real applications with Spring Boot 2",
                "https://danvega.dev/courses");

        courses.add(springBoot);
        return courses;
    }
}
