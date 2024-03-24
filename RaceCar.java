// Abstracción La clase modela un coche de carrera con sus propiedades y estados relevantes para la carrera.
// Encapsulamiento Las variables de instancia están encapsuladas y solo se acced a ellas a través de métodos getter y setter.


public class RaceCar {
    String driver;
    String state;
    String driversInterest;
    boolean tyresOn;
    boolean isTheWheelNutOn;
    boolean isFrontLifted;
    boolean isBackLifted;
    boolean areSidesLifted;
    boolean isFrontWingAdjusted;

    public RaceCar (String driver, String interest){
        this.driver = driver;
        this.state = "About to start a race";
        this.driversInterest = interest;
        this.tyresOn = true;
        this.isTheWheelNutOn = true;
        this.isFrontLifted = false;
        this.isBackLifted = false;
        this.areSidesLifted = false;
        this.isFrontWingAdjusted = false;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setDriversInterest(String driversInterest) {
        this.driversInterest = driversInterest;
    }

    public String getDriversInterest() {
        return driversInterest;
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
