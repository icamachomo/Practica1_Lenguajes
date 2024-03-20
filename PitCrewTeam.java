public class PitCrewTeam {
    private String role;
    private int memberId;
    private String assignedDriver;

    // Constructor
    public PitCrewTeam(String role, int memberId, String assignedDriver) {
        this.role = role;
        this.memberId = memberId;
        this.assignedDriver = assignedDriver;
    }

    // Getters y setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(String assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    // Método para realizar la tarea asignada
    public void performTask() {
        System.out.println("Ejecutando..." + assignedDriver + " by el miembro " + memberId);
    }
}
