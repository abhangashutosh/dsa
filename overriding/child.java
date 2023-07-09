package overriding;

class Child extends Parent {
    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}