import java.util.Dictionary;
import java.util.List;

public class method{

    public static void main(String[] args) {

        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5 ; 
        // int bonus = 100;
        // int score2 = 10000;
        // int levelCompleted2 = 8 ; 
        // int bonus2 = 200;
        
        // if (gameOver) {
        //     int finalScore = score + (levelCompleted * bonus);
        //     System.out.println("Your final score was : " + finalScore);

        //     int finalScore2 = score2 + (levelCompleted2 * bonus2);
        //     System.out.println("Your final score was : " + finalScore2);
        // };

        // displayScore(false,800, 5, 100);
        displayHighScorePosition("Bilal", calculateHighScorePosition(1500));
        displayHighScorePosition("Bilal", calculateHighScorePosition(900));
        displayHighScorePosition("Bilal", calculateHighScorePosition(400));
        displayHighScorePosition("Bilal", calculateHighScorePosition(50));
        displayHighScorePosition("Bilal", calculateHighScorePosition(500));

    };

    // public static void displayScore(boolean gameOver,int score, int levelCompleted, int bonus){
    //     String result = checkIfGameOver(gameOver, score, levelCompleted, bonus);
    //     System.out.println(result);
    // };

    // public static String checkIfGameOver(boolean gameOver,int score, int levelCompleted, int bonus) {
    //     if (gameOver) {
    //         int finalScore = calculateScore(score, levelCompleted, bonus);
    //         return ("Your final score was : " + finalScore);
    //     } else {
    //         return ("Resume Game");
    //     }
        
    // };

    // public static int calculateScore(int score, int levelCompleted, int bonus) {
    //     int finalScore = score + (levelCompleted * bonus);
    //     return finalScore;
    // };

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " manage to into position " + position + " on the high score table.");
    };

    public static int calculateHighScorePosition(int score) {
        // if (score >= 1000) {
        //     return 1;
        // } else if (score >= 500 && score < 1000) {
        //     return 2;
        // }else if (score >= 100 && score < 500) {
        //     return 3;
        // }else{
        //     return 4;
        // }
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000) {
            position = 2;
        }else if (score >= 100 && score < 500) {
            position = 3;
        }
        return position;
    }


}
