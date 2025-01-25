package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String message1 = m.getMessage1();
        String message2 = m.getMessage2();
        String message3 = m.getMessage3();
        String message4 = m.getMessage4();

        
        //Displays       
        System.out.println(message);// Greeting
        System.out.println(m.reverse(message));
        
        System.out.println(message1);// Message1
        System.out.println(m.reverse(message1));
        
        System.out.println(message2);// Message2
        System.out.println(m.reverse(message2)); 
        
        System.out.println(message3);// Message3
        System.out.println(m.reverse(message3)); 
        
        System.out.println(message4);// Message4
        System.out.println(m.upperCase(message4)); 
        
        
        
    }
    // Getters
    public String getGreeting() {
        return "Hello, World!";
    }
    public String getMessage1(){
    return "I'm a Little Teapot";
    }
    public String getMessage2(){
    return "Hey Diddle Diddle";
    }
    public String getMessage3(){
    return "Hickory Dickory Dock";
    }
    public String getMessage4(){
    return "Hello spring at jsu";
    }
    
    
    
    //Reversals method
    public String reverse(String message) {
        StringBuilder r = new StringBuilder(message);// converts String to StringBuilder
        r.reverse(); //reverse StringBuilder
        String newmessage = new String(r); // Changes results backs into String and stores into new var
        
        return newmessage; // Returns new var
    }
    //Uppercase method
    public String upperCase(String message){
        String u = message.toUpperCase();
        
        return u;
    }
    
}