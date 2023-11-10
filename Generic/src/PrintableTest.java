public class PrintableTest {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Функция print() в анонимном классе");
            }
        };
        p.print();
    }
}

