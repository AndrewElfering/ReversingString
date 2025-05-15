public class Main {
  public static void main(String[] args) {
 	String word = "Applause";
    String wordReversed = "";
    
    for (int i = word.length() -1; i>= 0; i--) {
    	wordReversed += word.charAt(i);
    }
    System.out.println(wordReversed);
  }
}
