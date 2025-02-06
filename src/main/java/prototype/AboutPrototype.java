package prototype;

public class AboutPrototype {

    /*
    왜 new로 안만들고 prototype패턴을 사용하는것인가?
    1. 종류가 너무 많아 클래스로 정리하기 힘든 경우 (예제에서 문자열에 다양한 것을 넣는것)
    2. 클래스로 부터 인스턴스 생성이 힘든 경우(ex, 마우스로 도형을 그리는 어플리케이션)
    3. 프레임워크와 생성하는 인스턴스를 분리하고 싶은 경우
        - 클래스 이름 대신 strong message나 slash box 문자열이 인스턴스 생성을 위한 이름으로 부여되었다.

    자바는 prototype 디자인 패턴을 clonable을 extends 한 clone()메서드를 통해 구현가능하다.
    자바의 clone()은 얕은 복사이며, 객체 자체는 새로운 메모리 주소를 가지지만, 참조형 필드는 같은 주소를 참조하게 된다.
    ex)
        public class Product implements Cloneable {
            private String name;
            private ProductDetails details;  // 참조형 필드
            ..
        p1 주소: Product@6d06d69c
        p1Clone 주소: Product@7852e922
        p1.details 주소: ProductDetails@7852e922
        p1Clone.details 주소: ProductDetails@7852e922
        p1 == p1Clone? false
        p1.details == p1Clone.details? true
    */

}
