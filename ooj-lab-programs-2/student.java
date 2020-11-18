package CIE;
import java.util.*;
 public class student{
  Scanner in=new Scanner(System.in);
  public String name,usn;
  public int sem;
  public void Accept(){
    System.out.println("Enter name and usn of a student");
    name=in.nextLine();
    usn=in.next();
    System.out.println("Enter sem of student");
    sem=in.nextInt();
  }
}
