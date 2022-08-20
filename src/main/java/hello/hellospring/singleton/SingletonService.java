package hello.hellospring.singleton;

public class SingletonService {

    // 많은 트래픽이 발생하될 경우 new 생성자로 새로운 객체를 매번 만들고 호출하게되면
    // 서버 부하가 생길 수 있다. 여기서 싱글톤 패턴이라는것을 배워보자
    // 싱글톤 패턴 = 객체를 하나만 생성되도록 보장해주는 것

    //1.static 영역에 객체를 1개만 생성
    private static final SingletonService instance = new SingletonService();

    //2.public으로 열어서 객체 인스턴스가 필요하면 이 STATIC 메서드를 통해서만 조회하게함
    public static SingletonService getInstance() {
        return instance; //자기자신의 객체 인스턴스를 하나만 생성해서 instance 로 들어감
    }
    //3.생성자를 private로 선언해 new 키워드를 사용한 객체 생성을 막는다
    //코드를 보고 아? 싱글톤 패턴이구나.
    private SingletonService(){
    }

    public static void main(String[] args) {
        System.out.println("싱글톤 객체 로직 호출");
    }


}
