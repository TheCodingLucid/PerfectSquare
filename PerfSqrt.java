import javax.swing.*;
import java.util.Scanner;    

public class PerfSqrt {
    public static void main(String[] args) {   
        String output = "";
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: ", JOptionPane.INFORMATION_MESSAGE));
        int perfSquares[] = new int[(int)Math.sqrt(num) + 2];
        
        int amountofSquares = 0;
        
        for (int x = 0; x <= num; x++){
            int square = (int)Math.sqrt(x);
                if (square*square == x){
                    amountofSquares++;
                    perfSquares[amountofSquares] = x;
                }
        }

        for(int i = 1; i <= perfSquares.length - 1; i++){
            output += perfSquares[i];
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output, "Perfect Squares", JOptionPane.INFORMATION_MESSAGE);
    }
}
