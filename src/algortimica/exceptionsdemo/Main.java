package algortimica.exceptionsdemo;

public class Main {

    public static void main(String[] args) {
        C c = new C();
        B b = new B(c);
        A a = new A(b);


        try {
            a.methodA(3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



        System.out.println("tralala");


    }
}
