import java.util.Random;
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int com = rn.nextInt(1,100);
        int flag =  1;
        int attempt= 1;
        int score = 0;
        System.out.println("select no. of attempt limit between 1 to 5");
        int limit=sc.nextInt();
        System.out.println("you have only " + limit + " attempt.");
        System.out.println("guess no. between 1 to 100");
        int user = sc.nextInt();
        while (flag<limit){
            if(user==com){
                if(attempt==1)
                    score=100;
                else if (attempt==2)
                score=75;
                else if (attempt==3)
                score=50;
                else if (attempt>limit)
                score=0;
                else
                score=20;
            }
            else if (user>com)
                {
                    System.out.println("guess lower no.");
                    user =sc.nextInt();

                }
            else {
                System.out.println("guess greater no.");
                user=sc.nextInt();

            }
            flag++;
            attempt++;

        }
        if (score>0){
            System.out.println("computer has selected :" + com );
            System.out.println("you have guessed in " + attempt + "  your score is" + score);
        }
        else {
            System.out.println("computer has selected :" + com);
            System.out.println("you lose the game    your score is " + score);
        }
    }
}
