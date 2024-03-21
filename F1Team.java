//Datos de ejemplo para la clase F1Team
public class F1Team {
    private String name;
    private int foundationYear;

    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
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
    }

}

