// Grandparent class
class Grandparent {
    void familyGrandparent() {
        int gid = 234;
        System.out.println("This is grandparent id= " + gid);
    }
}

// Parent class inheriting from Grandparent
class Parent extends Grandparent {
    void familyParent() {
        int pid = 567;
        System.out.println("This is parent id= " + pid);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    void familyChild() {
        int cid = 789;
        System.out.println("This is child id= " + cid);
    }
}

// Main class

public class multilevel_inheritance {
    public static void main(String[] args) {
        Child child = new Child(); // Create an object of the Child class

        // Methods from all levels of inheritance
        child.familyGrandparent();      // Inherited from Grandparent
        child.familyParent();   // Inherited from Parent
        child.familyChild();   // Defined in Child
    }
}
