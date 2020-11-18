import CIE.*;
import SEE.*;
import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n,tot=0;
    System.out.println("Enter number of students");
    n=in.nextInt();
    CIE.internals[] I = new CIE.internals[n];
    SEE.externals[] E= new SEE.externals[n];
    for(int i=0;i<n;i++){
      I[i]=new CIE.internals();
      E[i]=new SEE.externals();
      I[i].Accept();
      I[i].Acceptcie();
      E[i].Acceptsee();
      }
     for(int i=0;i<n;i++){
       System.out.println("Student "+(i+1));
       System.out.println("Name : "+I[i].name+"  USN : "+I[i].usn+"  SEM : "+I[i].sem);
       System.out.println("Total marks");
       for(int j=0;j<5;j++){
         tot=I[i].ciemar[j]+(E[i].seemar[j]/2);
         System.out.println("Subject "+(j+1)+" = "+tot);
       }
     }
  }
}
