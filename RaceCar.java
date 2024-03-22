public class RaceCar {
    String driver;
    String state;
    String driversNeed;
    boolean tyresOn;
    boolean isTheWheelNutOn;
    boolean isFrontLifted;
    boolean isBackLifted;
    boolean areSidesLifted;
    boolean isFrontWingAdjusted;

    public RaceCar (String driver, String driversNeed){
        this.driver = driver;
        this.state = "About to start a race";
        this.driversNeed = driversNeed;
        this.tyresOn = true;
        this.isTheWheelNutOn = true;
        this.isFrontLifted = false;
        this.isBackLifted = false;
        this.areSidesLifted = false;
        this.isFrontWingAdjusted = false;
    }

    public boolean areTyresOn() {
        return tyresOn;
    }

    public void setTyresOn(boolean tyresOn) {
        this.tyresOn = tyresOn;
    }

    public boolean isTheWheelNutOn() {
        return isTheWheelNutOn;
    }

    public void setTheWheelNutOn(boolean theWheelNutOn) {
        isTheWheelNutOn = theWheelNutOn;
    }

    public boolean isFrontLifted() {
        return isFrontLifted;
    }

    public void setFrontLifted(boolean frontLifted) {
        isFrontLifted = frontLifted;
    }

    public boolean isBackLifted() {
        return isBackLifted;
    }

    public void setBackLifted(boolean backLifted) {
        isBackLifted = backLifted;
    }

    public boolean areSidesLifted() {
        return areSidesLifted;
    }

    public void setAreSidesLifted(boolean areSidesLifted) {
        this.areSidesLifted = areSidesLifted;
    }

    public boolean isFrontWingAdjusted() {
        return isFrontWingAdjusted;
    }

    public void setFrontWingAdjusted(boolean frontWingAdjusted) {
        isFrontWingAdjusted = frontWingAdjusted;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}