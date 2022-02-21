package library.Library;

import library.Library.rent.ProfessorComponent;
import library.Library.rent.StudentComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = StudentComponent.class),
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ProfessorComponent.class)
)
public class AppConfig {
}
