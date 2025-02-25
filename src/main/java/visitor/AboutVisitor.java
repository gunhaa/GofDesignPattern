package visitor;

public class AboutVisitor {

    /*
    데이터 구조의 처리를 분리한다. 데이터 구조안을 돌아다니는 주체인 방문자를 나타내는 클래스를 준비하고
    그 클래스에 처리를 맡긴다.
    새로운 처리를 추가하고싶을때는 새로운 방문자를 만들면 된다.
    데이터 구조 쪽에서는 새로운 방문자를 받아주면 된다.

    =================================================

    왜 루프를 돌지 않고 이렇게 복잡한 구조를 만드는가?
    Visitor 패턴의 목적은 처리와 데이터구조를 분리하는 것이다.
    데이터 구조는 요소를 집합으로 정리하거나 요소 사이를 연결해주는 중요한 역할을 한다.
    즉, Visitor 패턴은 부품으로서의 독립성을 높여준다.
    처리 내용을 file 클래스나 directory 클래스의 메소드로 프로그램을 작성해버리면 새로운 처리를 추가할때마다 직접 클래스를 수정해야한다.

    ================================================

    향상된 for문(for-each 루프)은 Iterable 인터페이스를 구현한 객체에 대해 자동으로 iterator() 메서드를 호출하고, 그 Iterator를 사용하여 루프를 돌리게 된다.
    */
}
