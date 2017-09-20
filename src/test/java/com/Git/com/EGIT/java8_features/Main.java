package com.Git.com.EGIT.java8_features;

/*public class Main {
	public static void main(String[] args) {
        Base b = new derived();
        b.show();
    }
}
*/class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
 
class Parent extends Grandparent {
    public void Print() {
    	super.Print();  
        System.out.println("Parent's Print()");
    }
}
 
class Child extends Parent {
    public void Print() {
        super.Print();  
        System.out.println("Child's Print()");
    }
}
 
class Main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        System.out.println(System.identityHashCode(c));
       System.out.println(p.hashCode());
        c.Print();
    }
}