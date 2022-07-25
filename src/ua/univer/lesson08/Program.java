package ua.univer.lesson08;

class A{
    void print(){
        System.out.println("A");
    }
}
class B{
    void print(){
        System.out.println("B");
    }
}
interface IA{
    void f();
}
interface IB{
    void f();
}
class C extends A implements IA, IB{

    @Override
    public void f() {
        System.out.println("C");
    }
}

public class Program {
    public static void main(String[] args) {
        C c = new C();
        c.print();
        c.f();
    }
}
