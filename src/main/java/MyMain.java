public class MyMain {

    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    // Calculate the probability of rolling at least one 6 when rolling
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int numSuccess = 0;

        for (int i = 0; i < 10000; i++) {

            for (int j = 0; j < 6; j++) {
                if (rollDie() == 6 ) {
                    numSuccess++;
                    break;
                }
            }
        }

        return (numSuccess/10000.0) * 100;
    }

    // Calculate the probability of rolling at least two 6's when rolling
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int numSuccess = 0;

        for (int i = 0; i < 10000; i++) {
            int numSix = 0;

            for (int j = 0; j < 12; j++) {
                if (rollDie() == 6 ) {
                    numSix++;
                }
            }

            if (numSix >= 2) {
                numSuccess++;
            }
        }

        return (numSuccess/10000.0) * 100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int numSuccess = 0;

        for (int i = 0; i < 10000; i++) {
            int numSix = 0;

            for (int j = 0; j < 18; j++) {
                if (rollDie() == 6 ) {
                    numSix++;
                }
            }

            if (numSix >= 3) {
                numSuccess++;
            }
        }

        return (numSuccess/10000.0) * 100;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}