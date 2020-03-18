package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);
        // intelliJ auto shows the variable names for the args when not using variables in arg input

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // void signifies what the return value is.... so with void nothing is returned
        // int is now the datatype that's going to be returned.

        // another method that we'll use in the main
        // the args need datatype declarations

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
            // return exits the code block so no need for else
        };
        return -1;
        // returning nothing doesn't work.
        // returning null doesn't work.
        // i guess i have to return -1 because of int declaration in method definition

    }


}
