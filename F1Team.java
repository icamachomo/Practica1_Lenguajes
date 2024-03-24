// Abstracción: La clase F1Team encapsula los datos y comportamientos relacionados con un equipo de Fórmula 1
import java.util.Random;
//Datos de ejemplo para la clase F1Team
public class F1Team {
    private String name;
    private int foundationYear;
    private int numberOfVictories;
    private int teamMembers;
    private int tyreGunners; //4
    private int tyreOffMembers; //4
    private int tyreOnMembers; //4
    private int frontWingMembers; //2
    private int lollipopMan; //1
    private int frontJack; //1
    private int sideJack; //1
    private int rearJack; //1
    PitCrewTeam[] pitCrewTeam;

    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.numberOfVictories = setNumberOfVictories();
    }

    public void setPitCrewTeam(PitCrewTeam[] pitCrewTeam) {
        this.pitCrewTeam = pitCrewTeam;
        this.setNumberOfMembers();
    }

    private int setNumberOfVictories(){
        Random r = new Random();
        int random = r.nextInt(0,5);
        return random;
    }

    private void setNumberOfMembers(){
        PitCrewTeam[] team = this.pitCrewTeam;
        for(int i = 0; i < team.length; i++){
            PitCrewTeam person = team[i];
            String role = person.getRole();
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
                case "Front Jack":
                    if (this.frontJack < 2) {
                        frontJack++;
                    }
                    break;
                case "Side Jack":
                    if (this.sideJack < 2) {
                        sideJack++;
                    }
                    break;
                case "Rear Jack":
                    if (this.rearJack < 2) {
                        rearJack++;
                    }
                    break;

            }
            teamMembers++;
        }
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    // mostración
    public void displayTeamInfo() {
        System.out.println("F1 Team: " + name);
        System.out.println("Foundation Year: " + foundationYear);
        System.out.println("Number of victories: " + numberOfVictories);
        System.out.println("Number of Team Members: " + teamMembers);
        System.out.println("Number of Tyre Gunners: " + tyreGunners);
        System.out.println("Number of Tyre Off Members: " + tyreOffMembers);
        System.out.println("Number of Tyre On Members: " + tyreOnMembers);
        System.out.println("Number of Front Wing Members: " + frontWingMembers);
        System.out.println("Number of Lollipop Man: " + lollipopMan);
    }


}

