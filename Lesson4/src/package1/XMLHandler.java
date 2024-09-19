package package1;

public class XMLHandler extends AbstractHandler{

    @Override
    public void change() {
        System.out.println("Change XML");
    }
    @Override
    public void save() {
        System.out.println("Save XML");
    }
}
