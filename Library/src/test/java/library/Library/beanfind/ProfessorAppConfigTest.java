package library.Library.beanfind;

import library.Library.AppConfig;
import library.Library.rent.ProfessorRentService;
import library.Library.rent.RentService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfessorAppConfigTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("애플리케이션 빈 출력")
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName +"bean = " + bean);
            }
        }
    }

    @Test
    @DisplayName("RentServie로 조회했을 때 ProfessorService가 나온다")
    void findStudentRentServiceBean() {
        RentService rentService = ac.getBean(RentService.class);
        Assertions.assertThat(rentService).isInstanceOf(ProfessorRentService.class);
    }
}
