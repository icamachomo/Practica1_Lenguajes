import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        RaceCar carA = new RaceCar("Lucas","He likes art");
        RaceCar carB = new RaceCar("Santiago", "He likes rock music");

        PitCrewTeam pitTeam1 = new PitCrewTeam("Tyre Gunner", "Pablo");
        PitCrewTeam pitTeam2 = new PitCrewTeam("Tyre Gunner", "Augusto");
        PitCrewTeam pitTeam3 = new PitCrewTeam("Tyre Gunner", "Jack");
        PitCrewTeam pitTeam4 = new PitCrewTeam("Tyre Gunner", "José");
        PitCrewTeam pitTeam5 = new PitCrewTeam("Tyre On", "Pablo");
        PitCrewTeam pitTeam6 = new PitCrewTeam("Tyre On", "Cristian");
        PitCrewTeam pitTeam7 = new PitCrewTeam("Tyre On", "Tim");
        PitCrewTeam pitTeam8 = new PitCrewTeam("Tyre On", "Jacobo");
        PitCrewTeam pitTeam9 = new PitCrewTeam("Tyre Off", "Juan José");
        PitCrewTeam pitTeam10 = new PitCrewTeam("Tyre Off", "Pedro");
        PitCrewTeam pitTeam11 = new PitCrewTeam("Tyre Off", "Simón");
        PitCrewTeam pitTeam12 = new PitCrewTeam("Tyre Off", "Ernesto");
        PitCrewTeam pitTeam13 = new PitCrewTeam("Front Wing Man", "Fabio");
        PitCrewTeam pitTeam14 = new PitCrewTeam("Front Wing Man", "Hernán");
        PitCrewTeam pitTeam15 = new PitCrewTeam("Lollipop Man", "Osvaldo");

        TeamDriverB teamB1 = new TeamDriverB("Front Jack", "Juan", 'b', carB);
        TeamDriverB teamB2 = new TeamDriverB("Side Jacks", "Camilo and Carlos", 'b', carB);
        TeamDriverB teamB3 = new TeamDriverB("Rear Jack", "Oscar", 'b', carB);

        TeamDriverA teamA1 = new TeamDriverA("Front Jack", "Sebastián", 'a', carA);
        TeamDriverA teamA2 = new TeamDriverA("Side Jacks", "Felipe and Pablo", 'a', carA);
        TeamDriverA teamA3 = new TeamDriverA("Rear Jack", "Cesar", 'a', carA);


        System.out.println("Before starting the race you get one chance to learn more about the racers!");
        System.out.println("Choose one option");
        System.out.println("1. Get info about the racer´s interests");
        System.out.println("2. Ask Driver A a random question");
        System.out.println("3. Change Driver B´s mind");
        int op1 = kb.nextInt();
        System.out.println("");
        switch(op1){
            case 1:
                teamA1.getArtInfo(carA);
                teamB1.getMusicInfo(carB);
                break;
            case 2:
                teamA1.askSometing(carA);
                break;
            case 3:
                teamB1.changeInterests(carB);
                break;
        }
        System.out.println("All done, we are now ready to start the race!");
        System.out.println(" ");

        carA.setState("Started the race");
        carB.setState("Started the race");

        while(true){
            System.out.println("Choose an option: ");
            System.out.println("1. Take Driver A to the Pit Stop");
            System.out.println("2. Take Driver B to the Pit Stop");
            System.out.println("3. Get the Pit Team Info");
            System.out.println("4. Finish race and discover Winner");
            int op2 = kb.nextInt();

            switch(op2){

                case 1:
                    boolean ready = true;
                    while(true){
                        carA.setState("At the pit stop");
                        System.out.println("Choose an option (in corresponding order) ");
                        System.out.println("1. Lift Car");
                        System.out.println("2. Remove wheel nuts");
                        System.out.println("3. Tyres off");
                        System.out.println("4. Tyres on");
                        System.out.println("5. Put wheel nuts back on");
                        System.out.println("6. Adjust front wing");
                        System.out.println("7. Lower car");
                        System.out.println("8. Give sign to release");
                        int case1 = kb.nextInt();
                        switch(case1){
                            case 1:
                                teamA1.liftFront();
                                teamA2.liftSides();
                                teamA3.liftBack();
                            break;
                            case 2:
                                pitTeam1.removeWheelNut(carA);
                                System.out.println("by the team´s tyre gunners: ");
                                pitTeam1.printName();
                                pitTeam2.printName();
                                pitTeam3.printName();
                                pitTeam4.printName();
                                break;
                            case 3:
                                pitTeam9.removeTyres(carA);
                                System.out.println("by the team´s tyre offs: ");
                                pitTeam9.printName();
                                pitTeam10.printName();
                                pitTeam11.printName();
                                pitTeam12.printName();
                                break;
                            case 4:
                                pitTeam5.putTyresBackOn(carA);
                                System.out.println("by the team´s tyre ons: ");
                                pitTeam5.printName();
                                pitTeam6.printName();
                                pitTeam7.printName();
                                pitTeam8.printName();
                                break;
                            case 5:
                                pitTeam1.putWheelNutBackOn(carA);
                                System.out.println("by the team´s tyre gunners: ");
                                pitTeam1.printName();
                                pitTeam2.printName();
                                pitTeam3.printName();
                                pitTeam4.printName();
                                break;
                            case 6:
                                pitTeam13.adjustFrontWing(carA);
                                System.out.println("by the team´s wing men");
                                pitTeam13.printName();
                                pitTeam14.printName();
                                break;
                            case 7:
                                teamA1.lowerFront();
                                teamA2.lowerSides();
                                teamA3.lowerBack();
                                break;
                            case 8:
                                ready = pitTeam15.giveSignalToReleaseTheCar(carA);
                                break;
                        }
                        if(case1 == 8 && ready){
                            break;
                        }
                    }
                break;

                case 2:
                    boolean ready2 = false;
                    while(true){
                        carB.setState("At the pit stop");
                        System.out.println("Choose an option (in corresponding order) ");
                        System.out.println("1. Lift Car");
                        System.out.println("2. Remove wheel nuts");
                        System.out.println("3. Tyres off");
                        System.out.println("4. Tyres on");
                        System.out.println("5. Put wheel nuts back on");
                        System.out.println("6. Adjust front wing");
                        System.out.println("7. Lower car");
                        System.out.println("8. Give sign to release");
                        int case1 = kb.nextInt();
                        switch(case1){
                            case 1:
                                teamB1.liftFront();
                                teamB2.liftSides();
                                teamB3.liftBack();
                                break;
                            case 2:
                                pitTeam1.removeWheelNut(carB);
                                System.out.println("by the team´s tyre gunners: ");
                                pitTeam1.printName();
                                pitTeam2.printName();
                                pitTeam3.printName();
                                pitTeam4.printName();
                                break;
                            case 3:
                                pitTeam9.removeTyres(carB);
                                System.out.println("by the team´s tyre offs: ");
                                pitTeam9.printName();
                                pitTeam10.printName();
                                pitTeam11.printName();
                                pitTeam12.printName();
                                break;
                            case 4:
                                pitTeam5.putTyresBackOn(carB);
                                System.out.println("by the team´s tyre ons: ");
                                pitTeam5.printName();
                                pitTeam6.printName();
                                pitTeam7.printName();
                                pitTeam8.printName();
                                break;
                            case 5:
                                pitTeam1.putWheelNutBackOn(carB);
                                System.out.println("by the team´s tyre gunners: ");
                                pitTeam1.printName();
                                pitTeam2.printName();
                                pitTeam3.printName();
                                pitTeam4.printName();
                                break;
                            case 6:
                                pitTeam13.adjustFrontWing(carB);
                                System.out.println("by the team´s wing men");
                                pitTeam13.printName();
                                pitTeam14.printName();
                                break;
                            case 7:
                                teamB1.lowerFront();
                                teamB2.lowerSides();
                                teamB3.lowerBack();
                                break;
                            case 8:
                                ready2 = pitTeam15.giveSignalToReleaseTheCar(carA);
                                break;
                        }
                        if(case1 == 8 && ready2){
                            break;
                        }
                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;
            }

        }


    }
}