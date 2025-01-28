package HW0129;

public class Basketball{
    String firstName;
    String lastName;
    int scored;
    int taken;
    int passed;
    int covered;
    int lost;

    public Basketball(String firstName, String lastName, int scored, int taken, int passed, int covered, int lost) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scored = scored;
        this.taken = taken;
        this.passed = passed;
        this.covered = covered;
        this.lost = lost;
    }

    double calculateScore(){
        return scored - taken + (1.5 * taken) + (2 * covered) - (2 * lost);
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scored=" + scored +
                ", taken=" + taken +
                ", passed=" + passed +
                ", covered=" + covered +
                ", lost=" + lost +
                ", full score=" + calculateScore() +
                '}';
    }
}