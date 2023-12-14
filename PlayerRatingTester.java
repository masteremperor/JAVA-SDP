public class PlayerRatingTester {
    public static void main(String[] args) {
        // Test for two critics
        PlayerRating player1 = new PlayerRating(1, "Beckham", 9, 9.9);
        player1.displayDetails();

        System.out.println();

        // Test for three critics
        PlayerRating player2 = new PlayerRating(1, "Oscar", 1, 1, 1);
        player2.displayDetails();
    }
}

class PlayerRating {
    private int playerPosition;
    private String playerName;
    private double criticOneRating;
    private double criticTwoRating;
    private double criticThreeRating;
    private double averageRating;
    private char category;

    public PlayerRating(int playerPosition, String playerName, double criticOneRating, double criticTwoRating) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        calculateAverageRating();
        setCategory();
    }

    public PlayerRating(int playerPosition, String playerName, double criticOneRating, double criticTwoRating, double criticThreeRating) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        calculateAverageRating();
        setCategory();
    }

    public void calculateAverageRating() {
        if (criticThreeRating == 0) {
            // For two critics
            averageRating = (criticOneRating + criticTwoRating) / 2;
        } else {
            // For three critics
            averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
        }
    }

    private void setCategory() {
        if (averageRating >= 8.0) {
            category = 'A';
        } else if (averageRating >= 4.0) {
            category = 'B';
        } else {
            category = 'C';
        }
    }

    public void displayDetails() {
        System.out.println("The player name is " + playerName);
        System.out.println("The player position is " + playerPosition);
        System.out.println("The average rating is " + averageRating);
        System.out.println("The category is " + category);
    }
}