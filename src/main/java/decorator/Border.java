package decorator;

public abstract class Border implements Display{

    protected Display display;

    protected Border(Display display){
        this.display = display;
    }

}
