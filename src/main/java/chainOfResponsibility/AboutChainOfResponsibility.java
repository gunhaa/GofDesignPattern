package chainOfResponsibility;

public class AboutChainOfResponsibility {
    /*
    요청을 처리하는 객체들을 체인 형태로 연결하여, 각 객체가 요청을 처리할지 여부를 결정하고, 처리하지 못하면 다음 객체로 요청을 넘기는 디자인 패턴이다.
    ex) alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

    객체 간 결합도 감소
    클라이언트는 특정 핸들러를 지정하지 않아도 되어 유연성이 증가함.

    확장성 증가
    새로운 핸들러를 추가해도 기존 코드 변경 없이 체인에 추가 가능함.

    요청 처리 흐름이 명확함
    요청이 어떤 순서로 처리되는지 한눈에 파악 가능.

    ex) 웹 요청 필터가 해당 방식이 사용됨
        - 요청을 여러 필터(인증, 로깅, 데이터 변환 등)가 순차적으로 처리
    */
}
