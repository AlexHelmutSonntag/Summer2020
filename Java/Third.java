// This file is from 43:40 till 53:23
// It is about Strings

public class Third {
    public static void main(String[] args) {
        // String are reference types in Java
        // Thus we should initialize like this :
        // String message = new String("Hello World");
        // But then we get a warning called, String is redundant so this is an easier way to intialize a string
        String anotherstring = ", it's been a while";
        String message = "Hello World" + anotherstring;
        
        System.out.println(message.endsWith("e"));//true
        System.out.println(message.endsWith("!!"));//false
        System.out.println(message.length());//30
        System.out.println(message.indexOf("e"));//1
        System.out.println(message.indexOf("J"));//-1
        System.out.println(message.replace(",","."));//Hello World. it's been a while
        String testString  = "    I don't know";
        System.out.println(testString.trim());//I don't know
        System.out.println(message);

        String Ali = "Hello \"Ali\"";
        System.out.println(Ali);// Hello "Ali"
        String file_Path = "root@Ali:\\mnt\\f\\Summer2020\\Java#";
        System.out.println(file_Path);// Hello "Ali"



    }
}
