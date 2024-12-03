public class SleepRecord {

    private double hoursSlept;

    public SleepRecord() {
        this.hoursSlept = 0.0;
    }

    public double getHoursSlept() {
        return hoursSlept;
    }

    public void setHoursSlept(double hours) {
        this.hoursSlept = hours;
    }

    public void evaluateSleepQuality() {
        if (hoursSlept >= 7 && hoursSlept <= 9) {
            System.out.println("Your sleep quality is optimal!");
        } else if (hoursSlept < 7) {
            System.out.println("You need more sleep to improve your health.");
        } else {
            System.out.println("You may be getting too much sleep. Consider adjusting your schedule.");
        }
    }

    public void sleepRecommendation() {
        if (hoursSlept < 7) {
            System.out.println("Recommendation: Try to aim for at least 7 hours of sleep.");
        } else if (hoursSlept > 9) {
            System.out.println("Recommendation: Try to avoid sleeping for more than 9 hours.");
        } else {
            System.out.println("Recommendation: Keep up the good sleep habits!");
        }
    }

    public boolean isAdequateSleep() {
        return hoursSlept >= 7 && hoursSlept <= 9;
    }

    public void randomSleepFact() {
        String[] sleepFacts = {
                "Did you know? Sleep helps your brain clear out toxins!",
                "Sleep is essential for memory consolidation.",
                "You burn calories while you sleep!",
                "Getting enough sleep can improve your immune system."
        };

        int randomIndex = (int) (Math.random() * sleepFacts.length);
        System.out.println(sleepFacts[randomIndex]);
    }

    public String toString() {
        return "SleepRecord [Hours Slept: " + hoursSlept + " hours]";
    }
}