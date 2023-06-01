package fed.spring_clean.config;

import fed.spring_clean.repository.CourseRepository;
import fed.spring_clean.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("courseRepository")
    public CourseRepository getCourseRepository() {
        return new CourseRepository();
    }

    @Bean("courseService")
    public CourseService getCourseService() {
        return new CourseService(getCourseRepository() );
    }
}
