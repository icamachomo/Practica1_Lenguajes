// Herencia la clase TeamDriverA hereda de la clase PitCrewTam, lo que significa que adquiere todos los campos y métodos definidos en PitCrewTeam.


import java.util.Random;

public class TeamDriverA extends PitCrewTeam {
    private RaceCar carA;
    private char team;
    private int frontJack; //1
    private int sideJack; //1
    private int rearJack; //1

    public TeamDriverA(String role, String name, char team, RaceCar carA) {
        super(role, name, team);
        this.carA = carA;
        setNumberOfMembers(role);
    }

    private void setNumberOfMembers(String role) {
        switch (role) {
            case "Front Jack":
                if (this.frontJack < 1) {
                    frontJack++;
                }
                break;
            case "Side Jack":
                if (this.sideJack < 1) {
                    sideJack++;
                }
                break;
            case "Rear Jack":
                if (this.rearJack < 1) {
                    rearJack++;
                }
                break;

        }
    }

    //Distinct Methods

    public void getArtInfo(RaceCar car) {
        String driver = car.getDriver();
        Random r = new Random();
        int opcion = r.nextInt(1, 4);
        switch (opcion) {
            case 1:
                System.out.println(driver + "´s favorite painter is Picasso");
                break;
            case 2:
                System.out.println(driver + " has a Botero painting in his house");
                break;
            case 3:
                System.out.println(driver + "´s dream is to have his own art gallery");
        }
    }

    public void askSometing(RaceCar car) {
        String driver = car.getDriver();
        Random r = new Random();
        int opcion = r.nextInt(1, 4);
        switch (opcion) {
            case 1:
                System.out.println("Question: How old are you?");
                System.out.println("Answer: Im 24 years old");
                break;
            case 2:
                System.out.println("Question: Why do you like art so much?");
                System.out.println("Answer: Because my mom was an art teacher");
                break;
            case 3:
                System.out.println("Question: What are you looking forward to today?");
                System.out.println("Answer: I wan to win the race!");
        }
    }

    //Poliformismo para los métodos liftFront, liftBack y liftSides
    public void liftFront() {
        RaceCar car = this.carA;
        boolean frontLifted = car.isFrontLifted();
        if (!frontLifted) {
            car.setFrontLifted(true);
            System.out.println("The front of the car A was lifted by: " + this.getName());
        } else {
            System.out.println("The front is already lifted");
        }
    }

    public void liftBack() {
        RaceCar car = this.carA;
        boolean backLifted = car.isBackLifted();
        if (!backLifted) {
            car.setBackLifted(true);
            System.out.println("The back of the car A was lifted by: " + this.getName());
        } else {
            System.out.println("The back of the car A has already been lifted");
        }
    }

    public void liftSides() {
        RaceCar car = this.carA;
        boolean sidesLifted = car.areSidesLifted();
        if (!sidesLifted) {
            car.setAreSidesLifted(true);
            System.out.println("The sides of the car A were lifted by: " + this.getName());
        } else {
            System.out.println("The sides of the car A have already been lifted");
        }

    }

    public void lowerFront() {
        RaceCar car = this.carA;
        boolean frontLifted = car.isFrontLifted();
        if (frontLifted) {
            car.setFrontLifted(false);
            System.out.println("The front of the car A has been lowered by: " + this.getName());
        } else {
            System.out.println("The front has already been lowered");
        }
    }

    public void lowerBack() {
        RaceCar car = this.carA;
        boolean backLifted = car.isBackLifted();
        if (backLifted) {
            car.setFrontLifted(false);
            System.out.println("The back of the car A has been lowered by: " + this.getName());
        } else {
            System.out.println("The back has already been lowered");
        }
    }

    public void lowerSides() {
        RaceCar car = this.carA;
        boolean sidesLifted = car.areSidesLifted();
        if (sidesLifted) {
            car.setFrontLifted(false);
            System.out.println("The sides of the car A have been lowered by: " + this.getName());
        } else {
            System.out.println("The sides have already been lowered");
        }

    }
}
