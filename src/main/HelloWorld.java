package main;

public class HelloWorld {
    String text = "";

    public HelloWorld(){
    }

    public void sayHello(String name){
        text = name;
        System.out.println(toString());
    }

    public String toString(){
        return "Hello " + text;
    }
}
