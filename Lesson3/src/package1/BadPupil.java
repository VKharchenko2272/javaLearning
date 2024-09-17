package package1;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("study bad pupil");
    }

    @Override
    public void read() {
        System.out.println("read bad pupil");
    }

    @Override
    public void write() {
        System.out.println("write bad pupil");
    }

    @Override
    public void relax() {
        System.out.println("relax bad pupil");
    }
}
