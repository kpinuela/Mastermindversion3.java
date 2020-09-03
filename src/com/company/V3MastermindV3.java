import java.util.Scanner;

public class MasterMind {
    public static final String colors = "RGYBOP";
    public String generateSecret()
    {
        String secret="";
        for(int i=0;i<4;i++)
            secret = secret + colors.charAt((int)(Math.random()*5));
        return secret;
    }
    public String getGuess()
    {
        Scanner scode = new Scanner(System.in);
        System.out.println("Guesses consists of 4 letters from: "+colors);
        System.out.print("Please enter a 4 letter guess");
        String guess = scode.nextLine();
        return guess;
