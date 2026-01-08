import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Blackjack {
    private int[] cardYou = new int[5];
    private int[] cardComputer = new int[2];
    private int numYourCard = 1;
    private int sumYou, sumComputer = 0;
    private String winner;
    Scanner scanner = new Scanner(System.in);
    public Blackjack() {
        Arrays.fill(cardYou, 0);
        Random rand = new Random();
        cardYou[0] = rand.nextInt(11) + 1;
        cardYou[1] = rand.nextInt(11) + 1;
        sumYou = cardYou[0] + cardYou[1];

        cardComputer[0] = rand.nextInt(11) + 1;
        cardComputer[1] = rand.nextInt(11) + 1;

        if(sumYou == 22) {
            cardYou[0] = 1;
            sumYou = 12;
        }
        if(sumComputer == 22) {
            cardComputer[0] = 1;
            sumComputer = 12;
        }
    }
    public void showPlayerCard(){
        System.out.print("Card You: ");
        for(int value: cardYou){
            System.out.print(value+" ");
        }
        System.out.println();
    }

    public void showComputerCard(){
        System.out.print("Card Computer: ");
        for(int value: cardComputer){
        System.out.print(value+" ");
    }
        System.out.println();
    }

    public void addMoreCard(){
        Random rand = new Random();
        if(numYourCard <= 4) {
            numYourCard++;
            cardYou [numYourCard] =  rand.nextInt(11) + 1;
            sumYou += cardYou[numYourCard];
        }
    }

    public void showSumCard(){
        sumComputer = cardComputer[0] + cardComputer[1];
        System.out.println("Sum of your cards = " + sumYou);
        System.out.println("Sum of computer cards = " + sumComputer);
    }

    public boolean isEnd(){
        boolean end = true;
        if(sumYou == 21) {
            end = false;
        }
        else{
            end = true;
        }
        return end;
    }

    public void checkWinner(){
        if(sumYou > sumComputer) {
            winner = "You";
        }
        else{
            winner = "Computer";
        }
    }
    public String showWinner(){
        return winner;
    }
    public static void main(String[] args) {
        Blackjack bj = new Blackjack();
        Scanner scanner = new Scanner(System.in);
        String answer;
        while(bj.isEnd()){
            bj.showPlayerCard();
            System.out.println("Computer= ? ? ");
            System.out.println();
            System.out.println("Want another cards? y/n ...");
            answer = scanner.next();
            if(answer.equals("y")){
                bj.addMoreCard();
            }
            else{
                break;
            }
        }
        bj.showPlayerCard();
        bj.showComputerCard();
        System.out.println();
        bj.showSumCard();
        bj.checkWinner();
        System.out.println("The winner is " + bj.showWinner());
    }
}
