public class  if_stat {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5 ; 
        int bonus = 100;
        int score2 = 10000;
        int levelCompleted2 = 8 ; 
        int bonus2 = 200;
        
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);

            int finalScore2 = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was : " + finalScore2);
        };

        
    }
}
