/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist1;

/**
 *
 * @author 180mu
 */
public class StudentList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList1 = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Fgun Vankawla");
        
        Student s2 = new Student();
        s2.setName("Palak Shah");
        
         Student s3 = new Student();
        s3.setName("Megh Vankawla");
        
        studentList1[0] = s1;
        studentList1[1] = s2;
        studentList1[2] = s3;
        studentList1[3] = s4;
        
        for (Student s : studentList1) {
            System.out.println(s.getName());
        }
    }
    
}
