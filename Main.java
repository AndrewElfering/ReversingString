public class Main {
  public static void main(String[] args) {
    String myWord = "Applause";
    String myWordReversed = "";
    
    for (int i = myWord.length() -1; i>=0; i--) {
    	myWordReversed += myWord.charAt(i);
        }
    System.out.println(myWordReversed);
  }
}
