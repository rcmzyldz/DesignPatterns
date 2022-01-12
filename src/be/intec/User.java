package be.intec;

public class User {

    //Fields (attributes)
    String name;

    public User(String name){

        this.name = name;

    }

    //Methods
    public void sayHellosay(){

        System.out.println("Hi, my name is " + this.name);
    }


}
