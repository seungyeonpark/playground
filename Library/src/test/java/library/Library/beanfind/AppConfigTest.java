package library.Library.beanfind;

import library.Library.AppConfig;
import library.Library.rent.RentService;
import library.Library.rent.StudentRentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class AppConfigTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName +"bean = " + bean);
        }
    }

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
    @DisplayName("부모 타입으로 조회")
    void findBeanByParentTypeDuplicate() {
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class,
                () -> ac.getBean(RentService.class));
    }

    @Test
    @DisplayName("부모 타입으로 조회 - 자식 빈 이름 지정")
    void findBeanByParentTypeBeanName() {
        RentService studentRentService = ac.getBean("studentRentService", RentService.class);
        assertThat(studentRentService).isInstanceOf(StudentRentService.class);
    }

    @Test
    @DisplayName("부모 타입으로 조회 - 모두 조회")
    void findAllBeanByParentName() {
        Map<String, RentService> beansOfType = ac.getBeansOfType(RentService.class);
        assertThat(beansOfType.size()).isEqualTo(2);

        for (String key : beansOfType.keySet()) {
            System.out.println(beansOfType.get(key));
        }
    }
}
