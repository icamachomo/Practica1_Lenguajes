public interface WingAdjuster {
    String task = "Apply aerodynamic changes to the front wing";
    public void adjustFrontWing(RaceCar car);
    
    // Método adicional
    public void resetWingToDefault();
}
