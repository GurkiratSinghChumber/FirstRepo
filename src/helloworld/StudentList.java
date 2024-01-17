/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author gur28
 */
public class StudentList {
    public static void main(String args[]){
        Student s1 = new Student(1,"Ronak");
        Student[] student_list = new Student[3];
        
        student_list[0] = s1;
        System.out.println("Third commit");
        student_list[1] = new Student(2,"ab");
        student_list[2] = new Student(3,"abcc");
        
        
        for (Student student : student_list){
            System.out.println(student.getSname());
        }
        
    }
}
