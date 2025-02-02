package chainOfResponsibility;

public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    // 언제나 해결하지 않는 클래스
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
