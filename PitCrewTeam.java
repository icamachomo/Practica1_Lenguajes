public class PitCrewTeam implements TyreGunner, TyreOn, TyreOff, FrontJack, SideJack, RearJack, WingAdjuster, LollipopMan{

    private String role;
    private int memberId;
    private char team;
    private String assignedDriver;
    int teamMembers;
    int tyreGunners; //4
    int tyreOffMembers; //4
    int tyreOnMembers; //4
    int frontWingMembers; //2
    int lollipopMan; //1

    // Constructor
    public PitCrewTeam(String role, int memberId, char team) {
        this.role = role;
        this.memberId = memberId;
        this.team = team;
        setNumberOfMembers(role);
    }

    private void setNumberOfMembers (String role){
        switch(role){
            case "Tyre Gunner":
                if(this.tyreGunners < 4){
                    tyreGunners++;
                }
                    break;
            case "Tyre Off":
                if(this.tyreOffMembers < 4){
                    tyreOffMembers++;
                }
                    break;
            case "Tyre On":
                if(this.tyreOnMembers < 4){
                    tyreOnMembers++;
                }
                    break;
            case "Front Wing Man":
                if(this.frontWingMembers < 2){
                    frontWingMembers++;
                }
                break;
            case "Lollipop Man":
                if(this.lollipopMan < 1){
                    lollipopMan++;
                }

        }
    }

    // Getters y setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(String assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    public void addMember(){
        this.teamMembers = teamMembers++;
    }

    public void removeWheelNut(RaceCar car) {
        boolean wheelNutOn = car.isTheWheelNutOn();
        if(wheelNutOn){
            car.setTheWheelNutOn(false);
            System.out.println("The wheel nut has been taken off");
        } else {
            System.out.println("The wheel nut is already off");
        }
    }

    public void putWheelNutBackOn(RaceCar car) {
        boolean wheelNutOn = car.isTheWheelNutOn();
        if(!wheelNutOn){
            car.setTheWheelNutOn(true);
            System.out.println("The wheel nut has been put back on");
        } else {
            System.out.println("The wheel nut is already on");
        }
    }

    public void removeTyres(RaceCar car) {
        boolean tyresOn = car.areTyresOn();
        if(car.isFrontLifted() && car.isBackLifted() && car.areSidesLifted() ){
            if(tyresOn){
                car.setTyresOn(false);
                System.out.println("The tyres have been taken off");
            } else {
                System.out.println("The tyres are already off");
            }
        } else {
            System.out.println("The car needs to be lifted before taking the tyres off");
        }
    }

    public void putTyresBackOn(RaceCar car) {
        boolean tyresOn = car.areTyresOn();
        if(!tyresOn){
            car.setTyresOn(true);
            car.setFrontLifted(false);
            car.setBackLifted(false);
            car.setAreSidesLifted(false);
            car.setTheWheelNutOn(true);
            System.out.println("The tyres have been put back on and the car is on the ground");
        } else {
            System.out.println("The tyres are already on");
        }
    }

    public void liftFront(RaceCar car) {
        boolean frontLifted = car.isFrontLifted();
        if(!frontLifted){
            car.setFrontLifted(true);
            System.out.println("The front of the car has been lifted");
        } else {
            System.out.println("The front is already lifted");
        }
    }

    public void liftBack(RaceCar car) {
        boolean backLifted = car.isBackLifted();
        if(!backLifted){
            car.setFrontLifted(true);
            System.out.println("The back of the car has been lifted");
        } else {
            System.out.println("The back of the car is already lifted");
        }
    }

    public void liftSides(RaceCar car) {
        boolean sidesLifted = car.areSidesLifted();
        if(!sidesLifted){
            car.setFrontLifted(true);
            System.out.println("The sides of the car have been lifted");
        } else {
            System.out.println("The sides of the car have already been lifted");
        }

    }

    public void adjustFrontWing(RaceCar car) {
        boolean frontWingAdjusted = car.isFrontWingAdjusted();
        if(!frontWingAdjusted){
            car.setFrontWingAdjusted(true);
            System.out.println("The front wing has been adjusted");
        } else {
            System.out.println("The front wing has already been adjusted");
        }
    }

    public void giveSignalToReleaseTheCar(RaceCar car) {
        if(car.areTyresOn() && car.isFrontWingAdjusted() && car.isTheWheelNutOn() ){
            car.setState("The car is in movement");
            car.setFrontWingAdjusted(false);
        } else {
            System.out.println("The car is not ready, check if you have missed one of the team´s tasks \n¡Hurry up!");
        }
    }
}
