package com.onishchenko;

public class InheritanceRunner {
    static void main() {
        Parent parent = new Child();
        parent.run();
        foo(parent);
        foo(new SimpleChild());
        foo(new Parent());

        System.out.println(new SimpleChild());
    }

    public InheritanceRunner() {
        super();
    }

    static void foo(Parent parent) {
        parent.run();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
