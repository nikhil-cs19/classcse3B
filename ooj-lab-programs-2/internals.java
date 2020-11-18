package CIE;
 public class internals extends student{
  public int ciemar[] = new int[5];
  public void Acceptcie(){
    for(int i=0;i<5;i++){
      System.out.println("Enter cie marks of subject "+(i+1));
      ciemar[i]=in.nextInt();
    }
  }
}
