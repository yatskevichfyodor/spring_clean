package fed.spring_clean.config;

import fed.spring_clean.repository.CourseRepository;
import fed.spring_clean.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fed.spring_clean")
public class AppConfig {
}
