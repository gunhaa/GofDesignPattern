package singleton;

public class AboutSingleton {
    
    /*
    시스템 안에 1개만 존재한다는 것을 표현하는 디자인 패턴
    지정한 클래스의 인스터가 반드시 1개만 존재한다는 것을 보증할때 사용 한다
   signleton 클래스의 생성자는 private로 닫혀 생성자의 호출을 금지한다

   **********
        SingletonExecutor 실행 결과
        start
        인스턴스를 생성했습니다
        instance1 == instance2
        end

        프로그램 실행될떄 static이 실행되는게 아니고 클래스에 접근할때 static이 메모리에 올라간다.
        static 멤버는 클래스가 처음으로 로드될 때 메모리에 올라간다. static 블록이나 static 변수의 초기화 시점은 클래스가 "최ㅎ초로 사용될 때" 발생한다.
        변경이 불가능한 static final은 클래스가 로딩되지 않아도 사용가능(기본형, String 리터럴)하고, 참조형은 클래스가 로딩되어 사용 가능하다
    */
    
}
