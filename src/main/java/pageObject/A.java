package pageObject;

public abstract class A {
abstract void meth();
}
 class B extends A {
    void meth()
    {
        System.out.println("hello");
    }
}
class C {
    public static void main(String[] args) {
        A aa = new B();
        aa.meth();
    }

}