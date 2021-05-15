import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      String[] word=new String[20];
      Scanner sc = new Scanner(System.in);
      String Sent_input = sc.nextLine();
      word = Sent_input.split(" ");
      int[] freq = new int[20];
      int c = word.length;
      System.out.println(c);
      for(int x=0; x<c;x++){
         int count =0;
         //System.out.println(x);
         //System.out.println(word[x]);
         String s= word[x];
         for (String value : word) {
            if (s.equals(value)) {
               count++;
            }
         }
         freq[x]=count;
      }
      for(int z=0; z<c;z++){
         System.out.println(word[z]+": "+freq[z]);
      }
   }
}