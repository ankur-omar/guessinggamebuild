import java.util.Scanner;
public class guessword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "ankur";
        String guess = "";
        int guesscount = 0;
        int limit = 4;
        boolean outoflimit = false;
        while(!guess.equals(word)&& !outoflimit) {
            if (guesscount < limit) {
                System.out.println("Enter the  word");
                guess = input.next();
                guesscount++;
            } else {
                outoflimit = true;
            }
        }

            if (outoflimit) {
                System.out.println("you loss ! please try again !");
            } else {
                System.out.println("you win!");

            }


        }

}
