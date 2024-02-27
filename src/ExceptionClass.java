import java.io.IOException;

public class ExceptionClass {
    public static void main(String[] args) throws Exception {
        //override
        //default proanatiojn
        try {
//            String[] arr = new String[3];
//            arr[5] = "5 element";
//            System.out.println("try finish");
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("finish method");
        Exception exception;
        System.out.println("after exception");
        try {
            new NullPointerException("asfghfg");
        } catch (Exception ex) {
            System.out.println("null: " + ex.getMessage());
        }
        try {

            throw new MyExceptionClass("my spesific message");
        } catch (Exception ex) {
            System.out.println("my exception class: " + ex.getMessage());
        }
        method2();
    }

    public static void method2() throws Exception {
        method1();
    }

    public static void method1()  throws IOException{
        throw new IOException();
    }
}
