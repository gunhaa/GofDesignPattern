package chainOfResponsibility;

public class LimitSupport extends Support{
    
    private int limit;

    // 특정 번호 이하 해결 가능
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()<limit){
            return true;
        } else {
            return false;
        }
    }
}
