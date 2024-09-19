package package1;

public class DOCHandler extends  AbstractHandler{
    @Override
    public void change() {
        System.out.println("Change DOC");
    }
    @Override
    public void save() {
        System.out.println("Save DOC");
    }
}
