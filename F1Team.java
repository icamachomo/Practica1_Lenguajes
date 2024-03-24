// Abstracción: La clase F1Team encapsula los datos y comportamientos relacionados con un equipo de Fórmula 1
import java.util.Random;
//Datos de ejemplo para la clase F1Team
public class F1Team {
    private String name;
    private int foundationYear;
    private int numberOfVictories;

    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.numberOfVictories = setNumberOfVictories();
    }

    private int setNumberOfVictories(){
        Random r = new Random();
        int random = r.nextInt(0,5);
        return random;
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
    }

}

