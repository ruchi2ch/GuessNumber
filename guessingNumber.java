import javax.swing.*;
public class guessingNumber {
    public static void main(String[] args){
        int compNumber=(int)(Math.random()*100+1);
        int userNumber=0;
        System.out.println("The correct guess would be " + compNumber);
        int count=1;
        while (userNumber != compNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ check(userNumber, compNumber, count));
            count++;
        }
    }
    public static String check(int userNumber,int compNumber,int count){
        if(userNumber<=0 ||userNumber>100)
            return ("Invalid guess!! Try again...");
        else if (userNumber<compNumber)
            return ("your guess is low.\nTry again!! Total guess:"+count);
        else if (userNumber>compNumber)
            return ("your guess is high.\nTry again!! Total guess:"+count);
        else if (userNumber==compNumber)
            return ("Correct!! \nTotal guess:"+count);
        else
            return ("your guess is Incorrect.\nTry again!! Total guess:"+count);
    }
}
