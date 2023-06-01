package fed.spring_clean;

import fed.spring_clean.config.AppConfig;
import fed.spring_clean.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService = applicationContext.getBean("courseService", CourseService.class);
        System.out.println(courseService.list());
    }
}
