/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Noob
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stu = new Student();
        writeSomething();
        
        String studentInfo = stu.getInfo();
        
        System.out.println(studentInfo);
        
        Student stu1 =new Student("Kasper",27,"???");
        
        studentInfo = stu1.getInfo();
        
        System.out.println(studentInfo);
        System.out.println(stu1.name);
    }
    
    public static void writeSomething(){
        System.out.println("Something.");
    }
}
