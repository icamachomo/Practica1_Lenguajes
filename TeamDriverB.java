public class TeamDriverB extends PitCrewTeam{
    private RaceCar carB;
    private int frontJack; //1
    private int sideJack; //1
    private int rearJack; //1
    public TeamDriverB (String role, int memberId, char team, RaceCar carB){
        super(role, memberId, team);
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

    //Poliformismo para los métodos liftFront, liftBack y liftSides
    public void liftFront() {
        RaceCar car = this.carB;
        boolean frontLifted = car.isFrontLifted();
        if(!frontLifted){
            car.setFrontLifted(true);
            System.out.println("The front of the car B has been lifted");
        } else {
            System.out.println("The front is already lifted");
        }
    }

    public void liftBack() {
        RaceCar car = this.carB;
        boolean backLifted = car.isBackLifted();
        if(!backLifted){
            car.setFrontLifted(true);
            System.out.println("The back of the car B has been lifted");
        } else {
            System.out.println("The back of the car is already lifted");
        }
    }

    public void liftSides() {
        RaceCar car = this.carB;
        boolean sidesLifted = car.areSidesLifted();
        if(!sidesLifted){
            car.setFrontLifted(true);
            System.out.println("The sides of the car B have been lifted");
        } else {
            System.out.println("The sides of the car have already been lifted");
        }

    }
}