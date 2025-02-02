package chainOfResponsibility;

public class SpecialSupport extends Support{

    private int number;

    // 특정 번호만 해결 가능
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == this.number){
            return true;
        }else {
            return false;
        }
    }
}
