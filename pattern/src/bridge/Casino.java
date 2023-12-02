package bridge;

public class Casino extends Program{
    protected Casino(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Casino development in progress");
        developer.writeCode();
    }
}
