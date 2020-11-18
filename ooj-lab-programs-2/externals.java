package SEE;
import CIE.*;
import java.util.*;
public class externals extends CIE.student {
  Scanner in=new Scanner(System.in);
  public int seemar[]=new int[5];
  public void Acceptsee(){
    for(int i=0;i<5;i++){
      System.out.println("Enter SEE marks of subject "+(i+1));
      seemar[i]=in.nextInt();
    }
  }
}
