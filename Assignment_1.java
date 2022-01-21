import java.util.Scanner;

public class Assignment_1 {

    public void Game(){        System.out.println("How many rounds do you want to play? Please choose a number in a range of 1-10");
        Scanner scan = new Scanner(System.in);
        int rounds = scan.nextInt(); //scannig the input for the number of rows
        if(rounds > 10 || rounds < 1){
            System.err.println("Invalid parameter, the game quits");
            System.exit(0); //quits the game if the input number is invalid
        }
        System.out.println("You start! Pick a number to choose: 1 = Rock, 2 = Paper, 3 = Scissors");

        int tie_counter = 0, win_counter = 0, loose_counter = 0; // counter for the scores, all 0 by default

        for(int i = 0; i < rounds; i++) {
            Scanner choose = new Scanner(System.in); //users pick
            int pick = choose.nextInt();
            int machine = (int) (Math.random() * 3); //machine pick

            //game logic
            if (pick == machine) {
                System.out.println("Tie!");
                tie_counter++;
            } else if ((pick == 1 && machine == 3) || (pick == 2 && machine == 1) || (pick == 3 && machine == 2)) {
                System.out.println("User wins!");
                win_counter++;
            } else {
                System.out.println("Machine wins!");
                loose_counter++;
            }
            System.out.println("User: " + win_counter + " Machine: " + loose_counter + " Ties: " + tie_counter); //scorelime
        }
        //result display
        System.out.println("The final result is:");
        System.out.println("User win: " + win_counter + " Machine win: " + loose_counter + " Ties: " + tie_counter);
        if(win_counter>loose_counter){
            System.out.println("User wins the game!");
        }else if(loose_counter > win_counter){
            System.out.println("The machine wins the game!");
        }else{
            System.out.println("Tie!");
        }

        Restart();
    }

    public void Restart(){
        System.out.println("Do you want to play again? Please answer with 'No' or 'Yes' only");
        Scanner next = new Scanner(System.in);
        String forward = next.nextLine();//next game? input
        //implementing the restart game behaviour
        if(forward.equals("No")){
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        if(forward.equals("Yes")){
            Game();
        }
    }



    public static void main(String[] args){


        System.out.println("Play Rock, Paper, Scissors");

        Assignment_1 game = new Assignment_1();
        game.Game();


    }
}
