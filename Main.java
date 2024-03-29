import java.util.Scanner;
import java.util.Random;

// Encapsulamiento: Creación de objetos RaceCar y PitCrewTeam
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        F1Team eafun = new F1Team("Eafun", 2024);

        // Encapsulamiento: Creación de objetos RaceCar
        RaceCar carA = new RaceCar("Lucas", "he likes art");
        RaceCar carB = new RaceCar("Santiago", "he likes rock music");

        // Encapsulamiento: Creación de objetos PitCrewTeam
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

        // Herencia: Creación de objetos TeamDriverB y TeamDriverA
        TeamDriverB teamB1 = new TeamDriverB("Front Jack", "Juan", 'b', carB);
        TeamDriverB teamB2 = new TeamDriverB("Side Jacks", "Camilo and Carlos", 'b', carB);
        TeamDriverB teamB3 = new TeamDriverB("Rear Jack", "Oscar", 'b', carB);

        TeamDriverA teamA1 = new TeamDriverA("Front Jack", "Sebastián", 'a', carA);
        TeamDriverA teamA2 = new TeamDriverA("Side Jacks", "Felipe and Pablo", 'a', carA);
        TeamDriverA teamA3 = new TeamDriverA("Rear Jack", "Cesar", 'a', carA);

        PitCrewTeam[] pitCrewTeam = {teamA1, teamA2, teamA3, teamB1, teamB2, teamB3, pitTeam1, pitTeam2, pitTeam3, pitTeam4, pitTeam5, pitTeam6, pitTeam7, pitTeam8, pitTeam9, pitTeam10, pitTeam11, pitTeam12, pitTeam13, pitTeam14, pitTeam15 };
        eafun.setPitCrewTeam(pitCrewTeam);

        System.out.println("\033[31m¡WELCOME TO F1!\u001B[0m");
        System.out.println("\n\033[31mBefore starting the race you get ONE CHANCE to learn something about the racers!\u001B[0m");
        System.out.println("Team A´s racer: " + carA.getDriver() + ", " + carA.getDriversInterest());
        System.out.println("Team B´s racer: " + carB.getDriver() + ", " + carB.getDriversInterest());
        System.out.println("\033[31m\nChoose one option\u001B[0m");
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
        System.out.println("All done, you got to know the racers and we are now ready to start the race!");
        System.out.println(" ");

        carA.setState("Started the race");
        carB.setState("Started the race");

        while(true){
            System.out.println("\033[31mChoose an option: \u001B[0m");
            System.out.println("1. Take Driver A to the Pit Stop");
            System.out.println("2. Take Driver B to the Pit Stop");
            System.out.println("3. Get the Pit Team Info");
            System.out.println("4. Finish race and discover Winner");
            int op2 = kb.nextInt();

            switch(op2){

                case 1:
                    boolean ready = false;
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    while(true){
                        carA.setState("At the pit stop");
                        System.out.println("\033[31mDriver A´s Pit Stop (choose in corresponding order)\u001B[0m ");
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
                        System.out.println("\n");
                        System.out.println("\n");
                        System.out.println("\n");
                    }
                break;

                case 2:
                    boolean ready2 = false;
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    while(true){
                        carB.setState("At the pit stop");
                        System.out.println("\033[31mDriver B´s Pit Stop (choose in corresponding order) \u001B[0m");
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
                                ready2 = pitTeam15.giveSignalToReleaseTheCar(carB);
                                break;
                        }
                        if(case1 == 8 && ready2){
                            break;
                        }
                        System.out.println("\n");
                        System.out.println("\n");
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.println("PIT TEAM INFO");
                    eafun.displayTeamInfo();
                    System.out.println("(You can replace \033[31min the code\u001B[0m the instance you want to display)");
                    System.out.println("\nTEAM MEMBER INFO");
                    pitTeam1.displayTeamInfo(); // Aquí reemplaza pitTeam1 con la instancia correcta que deseas mostrar
                    System.out.println("\nIf team = 'z' it means this member belongs to the Pit Crew of both drivers");

                    break;

                case 4:
                Random random = new Random();
                int randomCarA = random.nextInt(1000);
                int randomCarB = random.nextInt(1000);

                if(randomCarA > randomCarB){
                    System.out.println("The winner is: Team A's racer - " + carA.getDriver());
                } else if(randomCarA < randomCarB){
                    System.out.println("The winner is: Team B's racer - " + carB.getDriver());
                } else {
                    System.out.println("It's a tie!");
                }
                    break;
            }
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");

            if(op2 == 4){
                System.out.println("\033[31m¡Thank you for competing with Eafun´s F1 Team!\u001B[0m");
                break;
            }
        }


    }
}