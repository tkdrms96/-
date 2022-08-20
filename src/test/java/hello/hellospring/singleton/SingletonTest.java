package hello.hellospring.singleton;

import hello.hellospring.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){

        //싱글톤서비스를 만든 후 같은 객체 인스턴스를 반환하는지 확인해보기
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println(singletonService1);
        System.out.println(singletonService2);
        //결과 service 1과 2 두개의 객체를 만들어 반환하는게 아닌 같은 인스터스를 가진 주소값을 반환함
        //.. 왜? 자바가 실행되는 동시에 하나의 객체만 생성시켜 리턴하는 Instance 구조로 만들었기때문에 SingletonService

        //근데 이렇게 할 필요가 없엉! 스프링이 싱글톤 패턴을 지원해줌!
    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService1 = ac.getBean
    }

}
