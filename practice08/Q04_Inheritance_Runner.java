package practice_repo.b103Practice.practice08;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {
        B obj1 = new B();

        System.out.println(obj1.i);
        obj1.yazdir();

        A objA = new A();
        objA.yazdir();

        A obj2 = new B();
        System.out.println(obj2.j);
        obj2.yazdir();

    }
}
