import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, Exception {
        try {
            test();
        } catch (Throwable ex) {
            System.out.println("test  " + ex);
            try {
                try {
                    test2();
                } catch (RuntimeException e) {

                    System.out.println("test 2 " + e);
                }
            } catch (Throwable exc) {
                System.out.println("inner catch");
            }
            System.out.println("outer catch");
        }
        System.out.println("Finish");
        Student student = new Student();
        student.method();
    }

    public static void test() {
        test();
    }

    public static void test2() {
        test2();
    }

}