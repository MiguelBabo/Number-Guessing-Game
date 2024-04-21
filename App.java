import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int num = random.nextInt(1000)+1;
        int tries = 0;
        int userGuess = 0;

        while (userGuess != num) {
            
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 0 and 1000: "));

            if(userGuess < num){
                JOptionPane.showMessageDialog(null, "The number is greater than "+userGuess);
            }else if(userGuess > num){
                JOptionPane.showMessageDialog(null, "The number is lower than "+userGuess);
            }else if(userGuess == num){
                JOptionPane.showMessageDialog(null, "You got it!");
                JOptionPane.showMessageDialog(null, "Total tries: "+tries);
            }else{
                JOptionPane.showMessageDialog(null, "This is not an valid input");
            }

            tries++;
        }
    }
}
