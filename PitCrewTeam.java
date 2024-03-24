public class PitCrewTeam implements TyreGunner, TyreOn, TyreOff, FrontJack, SideJack, RearJack, WingAdjuster, LollipopMan{

    private String role;
    private String name;
    private String assignedDriver;
    private char team;
    private int teamMembers;
    private int tyreGunners; //4
    private int tyreOffMembers; //4
    private int tyreOnMembers; //4
    private int frontWingMembers; //2
    private int lollipopMan; //1

    // Constructor
    public PitCrewTeam(String role, String name, char team) {
        this.role = role;
        this.name = name;
        this.team = team;
        setNumberOfMembers(role);
    }

    public PitCrewTeam(String role, String name) {
        this.role = role;
        this.name = name;
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

    public String getName() {
        return name;
    }
    public void printName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
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
            System.out.print("The wheel nuts have been taken off ");
        } else {
            System.out.print("The wheel nuts have already been taken off ");
        }
    }

    public void putWheelNutBackOn(RaceCar car) {
        boolean wheelNutOn = car.isTheWheelNutOn();
        if(!wheelNutOn){
            car.setTheWheelNutOn(true);
            System.out.print("The wheel nuts have been put back on ");
        } else {
            System.out.print("The wheel nuts have alreafu been put back on ");
        }
    }

    public void removeTyres(RaceCar car) {
        boolean tyresOn = car.areTyresOn();
        boolean front = car.isFrontLifted();
        boolean sides = car.areSidesLifted();
        boolean back = car.isBackLifted();
        boolean wheelNut = car.isTheWheelNutOn();
        if(front && sides && back){
            if(tyresOn && !wheelNut){
                car.setTyresOn(false);
                System.out.print("The tyres have been taken off ");
            } else {
                System.out.print("The tyres have already been taken off");
            }
        } else {
            System.out.print("The car needs to be lifted and/or the wheel nuts haven´t been taken of ");
        }
    }

    public void putTyresBackOn(RaceCar car) {
        boolean tyresOn = car.areTyresOn();
        if(!tyresOn){
            car.setTyresOn(true);
            System.out.print("The new tyres have been put back on ");
        } else {
            System.out.print("The tyres have already been put on ");
        }
    }

    public void liftFront(RaceCar car) {
        boolean frontLifted = car.isFrontLifted();
        if(!frontLifted){
            car.setFrontLifted(true);
            System.out.println("The front of the car has been lifted");
        } else {
            System.out.print("The front is already lifted");
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

    public void lowerFront(RaceCar car){
        boolean frontLifted = car.isFrontLifted();
        if(frontLifted){
            car.setFrontLifted(false);
            System.out.println("The front of the car has been lowered");
        } else {
            System.out.println("The front is already lowered");
        }
    }

    public void lowerBack(RaceCar car){
        boolean backLifted = car.isBackLifted();
        if(backLifted){
            car.setFrontLifted(false);
            System.out.println("The back of the car has been lowered");
        } else {
            System.out.println("The back is already lowered");
        }
    }

    public void lowerSides(RaceCar car){
        boolean sidesLifted = car.areSidesLifted();
        if(sidesLifted){
            car.setFrontLifted(false);
            System.out.println("The sides of the car have been lowered");
        } else {
            System.out.println("The sides are already lowered");
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

    public boolean giveSignalToReleaseTheCar(RaceCar car) {
        boolean bool = false;
        if(car.areTyresOn() && car.isFrontWingAdjusted() && car.isTheWheelNutOn() ){
            car.setState("The car is now in movement!");
            car.setFrontWingAdjusted(false);
            bool = true;
            System.out.println("\033[31mThe car is in movement!!!\u001B[0m");
        } else {
            System.out.println("tyres" + car.areTyresOn());
            System.out.println("font wing" + car.isFrontWingAdjusted());
            System.out.println("wheel nut" + car.isTheWheelNutOn());
            System.out.println("The car is not ready, check if you have missed one of the team´s tasks \n¡Hurry up!");
        }
        return bool;
    }
}
