// Herencia la clase TeamDriverB hereda de la clase PitCrewTeam, lo que significa q adquiere todos los campos y métodos definidos en PitCrewTeam.

import java.util.Random;
public class TeamDriverB extends PitCrewTeam{
    private RaceCar carB;

    private String name;
    private int age;

    public TeamDriverB (String role, String name, char team, RaceCar carB){
        super(role, name, team);
        this.carB = carB;
        this.setAge();
    }

    private void setAge(){
        Random r = new Random();
        int opcion = r.nextInt(20,46);
        this.age = opcion;
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
                car.setDriversInterest("he wants to learn how to surf");
                break;
            case 2:
                System.out.println(driver + " decided to quit F1! This is his last race :(");
                car.setDriversInterest("he is quiting F1 and decided to become a doctor");
                break;
            case 3:
                System.out.println(driver + " decided he wants to start bike racing");
                car.setDriversInterest("he decided to start bike racing");
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
        car.setOnTheGround(false);
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
            System.out.println("The sides of the car B were lifted by: " + this.getName());
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
        car.setOnTheGround(true);
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
