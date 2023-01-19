/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * store and print student details
 *view class - user interaction 
 * @author rikhi
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list= new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("peter");
        s1.setSid(23);
        s2.setName("tom");
        s2.setSid(25);
        s3.setName("jerry");
        s3.setSid(29);
        //store object in the array so that is why we called it array of object
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<=list.length;i++){
        System.out.println(list[i].getName()+" "+ list[i].getSid());
        }
    }
    
}
