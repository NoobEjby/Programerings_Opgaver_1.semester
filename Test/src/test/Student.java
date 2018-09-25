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
public class Student {
//    Atributes

    public String name;
    public int age;
    public String studyProgramme;

//    Constructers
    public Student() {
        name = "John Doe";
        age = 60;
        studyProgramme = "Software Engineering";
    }

    public Student(String sName, int sAge, String sStudentProgramme) {
        name = sName;
        age = sAge;
        studyProgramme = sStudentProgramme;
    }

//    Methods
    public String getInfo() {
        return name + " " + age + " " + studyProgramme;
    }

}
