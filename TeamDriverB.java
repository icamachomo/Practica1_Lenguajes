import java.util.Random;
public class TeamDriverB extends PitCrewTeam{
    private RaceCar carB;
    private int frontJack; //1
    private int sideJack; //1
    private int rearJack; //1
    public TeamDriverB (String role, String name, char team, RaceCar carB){
        super(role, name, team);
        this.carB = carB;
        setNumberOfMembers(role);
    }

    private void setNumberOfMembers (String role){
        switch(role){
            case "Front Jack":
                if(this.frontJack < 1){
                    frontJack++;
                }
                break;
            case "Side Jack":
                if(this.sideJack < 1){
                    sideJack++;
                }
                break;
            case "Rear Jack":
                if(this.rearJack < 1){
                    rearJack++;
                }
                break;

        }
    }

    //Distinct Methods

    public void getMusicInfo(RaceCar car){
        String driver = car.getDriver();
        Random r = new Random();
        int opcion = r.nextInt(1,4);
        switch(opcion){
            case 1:
                System.out.println(driver + "´s favorite band is AC/DC");
                break;
            case 2:
                System.out.println(driver + " started to play the gitar when he was 5 years old");
                break;
            case 3:
                System.out.println(driver + "´s favorite song is Bohemian Rapsody");
        }
    }

    public void changeInterests(RaceCar car){
        String driver = car.getDriver();
        Random r = new Random();
        int opcion = r.nextInt(1,4);
        switch(opcion){
            case 1:
                System.out.println(driver + " no longer likes rock, he wants to learn how to surf");
                car.setDriversInterest("He wants to learn how to surf");
                break;
            case 2:
                System.out.println(driver + " decided to quit F1! This is his last race :(");
                car.setDriversInterest("He is quiting F1 and decided to become a doctor");
                break;
            case 3:
                System.out.println(driver + " decided he wants to start bike racing");
                car.setDriversInterest("He decided to start bike racing");
        }
    }



    //Poliformismo para los métodos liftFront, liftBack y liftSides
    public void liftFront() {
        RaceCar car = this.carB;
        boolean frontLifted = car.isFrontLifted();
        if(!frontLifted){
            car.setFrontLifted(true);
            System.out.println("The front of the car B was lifted by: " + this.getName());
        } else {
            System.out.println("The front is already lifted");
        }
    }

    public void liftBack() {
        RaceCar car = this.carB;
        boolean backLifted = car.isBackLifted();
        if(!backLifted){
            car.setBackLifted(true);
            System.out.println("The back of the car B was lifted by: " + this.getName());
        } else {
            System.out.println("The back of the car is already lifted");
        }
    }

    public void liftSides() {
        RaceCar car = this.carB;
        boolean sidesLifted = car.areSidesLifted();
        if(!sidesLifted){
            car.setAreSidesLifted(true);
            System.out.println("The sides of the car b were lifted by: " + this.getName());
        } else {
            System.out.println("The sides of the car have already been lifted");
        }

    }

    public void lowerFront(){
        RaceCar car = this.carB;
        boolean frontLifted = car.isFrontLifted();
        if(frontLifted){
            car.setFrontLifted(false);
            System.out.println("The front of the car B has been lowered by: " + this.getName());
        } else {
            System.out.println("The front has already been lowered");
        }
    }

    public void lowerBack(){
        RaceCar car = this.carB;
        boolean backLifted = car.isBackLifted();
        if(backLifted){
            car.setBackLifted(false);
            System.out.println("The back of the car B has been lowered by: " + this.getName());
        } else {
            System.out.println("The back has already been lowered");
        }
    }

    public void lowerSides(){
        RaceCar car = this.carB;
        boolean sidesLifted = car.areSidesLifted();
        if(sidesLifted){
            car.setAreSidesLifted(false);
            System.out.println("The sides of the car B have been lowered by: " + this.getName());
        } else {
            System.out.println("The sides have already been lowered");
        }

    }
}
