package org.king.plataformaConsumer1;

public class Library {
    public String greetPlataforma(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return plataforma.greet(name);
    }
    public String greet(String name) {
        return "greet from plataforma-consumer-1 " + name;
    }
    public String greet1(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "greet1 from plataforma-consumer-1 via plataforma greet1 " + plataforma.greet1(name);
    }
    public String greet2(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "greet2 from plataforma-consumer-1 via plataforma greet2 " + plataforma.greet2(name);
    }
    public String greet3(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "greet3 from plataforma-consumer-1 via plataforma greet3 " + plataforma.greet3(name);
    }
    public String greet4(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "greet4 from plataforma-consumer-1 via plataforma greet4 " + plataforma.greet4(name);
    }
    public String greet5(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "greet5 from plataforma-consumer-1 via plataforma greet5 " + plataforma.greet5(name);
    }
    public String greet6(String name) {     
        org.king.libdep4.Library libdep4 = new org.king.libdep4.Library();  
        return "greet6 from plataforma-consumer-1 " + libdep4.greet1(name);
    }    
}