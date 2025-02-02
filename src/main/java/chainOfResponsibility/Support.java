package chainOfResponsibility;

public abstract class Support {

    private String name;
    // 넘길곳
    private Support next;

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }
    // 해결 절차
    public void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        } else if(next != null){
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble+ " is resolved by "+ this + ".");
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }

    @Override
    public String toString() {
        return "["+ name +"]";
    }
}
