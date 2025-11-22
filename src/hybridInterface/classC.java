package hybridInterface;

interface interfaceA{
    void method1();

}

interface interfaceB{
    void method2();
}


public class classC implements interfaceA, interfaceB {
    public void method1(){
        System.out.println("this is a method 1 from interface A");

    }

    public void method2(){
        System.out.println("this is a method 2 from interface B");

    }

    public void method3(){
        System.out.println("this is a method 3 from Class C");

    }
}
