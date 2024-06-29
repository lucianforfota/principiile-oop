package algortimica.exceptionsdemo;

public class C {

    public void methodC(int x) throws Exception{
        if (x<10){
            throw new Exception("x has an invalid value");
        }
        int a = x+3;
        System.out.println(a);
    }
}
