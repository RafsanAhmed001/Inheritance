package multipleInheritance;

interface A {
    default void cls1() {
        System.out.println("this is class 1");
    }
}

interface B {
    default void cls2(){
        System.out.println("this is class 2");
    }
}

class C implements A,B{

    public void class3() {
        cls1();
    }


    public void class4(){
        cls2();
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.cls1();
        obj.cls2();

    }
}
