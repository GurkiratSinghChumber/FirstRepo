
package helloworld;
import java.util.Scanner;
/**
 *
 * @author gur28
 */
public class chararray {
    public static void main(String args[]){
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        
    
        String word = sc.nextLine();
        
        char[] myLetters = new char[word.length()];
        
        for(int i =0 ; i<word.length();i++){
            myLetters[i] = word.charAt(i);
        }
        
        for(int i = myLetters.length -1; i>=0; i--){
            System.out.print(myLetters[i]);
        }
     
        for(char letter : myLetters){
            System.out.print(letter);
        }
        
    }
}
