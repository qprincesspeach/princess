abstract class Mario{
  public abstract void attack();
  public abstract void defend();
}
class SuperMario extends Mario{
  public void attack(){
    System.out.println("Super Mario attacks with green fire ball!");
  }
  public void defend(){
    System.out.println("SuperMario defends with red shell!");
  }
 }
class Main{
  public static void main(String[] args){
    SuperMario yoshi = new SuperMario();
    yoshi.attack();
    yoshi.defend();
   }
  }// hi princess, your code looks great
