import java.util.*;
class numbergame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        int MaxAttempts = 5;
        int Attempts = 0;
        int score = 0;

        do{
            System.out.println("Guess my number: ");
            userNumber = sc.nextInt();
            Attempts++;

            if(userNumber == myNumber){
                System.out.println("yes..That's Correct Number");
                score += MaxAttempts - Attempts +1;
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("The number you gussed is too high");
            }
            else{
                System.out.println("The number you gussed is too small");
            }

            if(Attempts == MaxAttempts){
                System.out.println("Your attempts are finised");
                break;
            }
        }while(userNumber >=0);

        System.out.println("Your final score is:" + score);
    }
}