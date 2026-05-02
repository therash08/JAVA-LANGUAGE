
public class GrandPa {

    int local_var = 7;

    GrandPa() {
        System.out.println("Default constructor of Grand Pa");
    }

    void m1() {
        System.out.println("Inside m1 method of Grand Pa");
    }
}

public class Parent extends GrandPa {

    int local_var;

    Parent() {
        System.out.println("Default constructor of Parent");
    }

    Parent(int n) {
        this.local_var = n;
        System.out.println(this.local_var);
        System.out.println(this);
        System.out.println("Params constructor of Parent");
    }

    void m1() {
        System.out.println("Inside m1 method of parent");
    }
}

public class Child extends Parent {

    int local_var;

    Child() {
        System.out.println("Default constructor of Child");
    }

    Child(int v) {
        super(7);
        System.out.println("Params constructor of Child");
    }

    void m3() {
        System.out.println("Inside m3 method of Child");
    }

    void m2() {
        System.out.println("Inside m2 method of Child");
    }

    public static void main(String[] args) {
        Child ob_child = new Child(7);
        System.out.println(ob_child.local_var);
        ob_child.m1();
    }
}
