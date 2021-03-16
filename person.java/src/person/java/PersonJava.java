/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.java;

/**
 *
 * @author
 */
public class PersonJava {
String name;
int age;

    public PersonJava(String name, int age){
       this.name = name;
       this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fName, IName, stuStatus;
        int stuId;
        
        fName = "Lisa Palombo";
        IName = "Lisa";
        stuStatus = "Active";
        stuId = 123456789;
        
        System.out.println("Student Name : " + fName);
        System.out.println("IName : " + IName);
        System.out.println("Student Status : " + stuStatus);
        System.out.println("Student ID : " + stuId);
    }
    
}
