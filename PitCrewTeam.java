public class PitCrewTeam implements TyreGunner, TyreOn, TyreOff, FrontJack, SideJack, RearJack, WingAdjuster, LollipopMan {

    // Atributos de la clase
    private String role;
    private int memberId;
    private String assignedDriver;
    private char team;
    private int teamMembers;
    private int tyreGunners; //4
    private int tyreOffMembers; //4
    private int tyreOnMembers; //4
    private int frontWingMembers; //2
    private int lollipopMan; //1

    // Constructor
    public PitCrewTeam(String role, int memberId, char team) {
        this.role = role;
        this.memberId = memberId;
        this.team = team;
        setNumberOfMembers(role);
    }

    // Método privado para establecer el número de miembros según el rol
    private void setNumberOfMembers(String role) {
        switch (role) {
            case "Tyre Gunner":
                if (this.tyreGunners < 4) {
                    tyreGunners++;
                }
                break;
            case "Tyre Off":
                if (this.tyreOffMembers < 4) {
                    tyreOffMembers++;
                }
                break;
            case "Tyre On":
                if (this.tyreOnMembers < 4) {
                    tyreOnMembers++;
                }
                break;
            case "Front Wing Man":
                if (this.frontWingMembers < 2) {
                    frontWingMembers++;
                }
                break;
            case "Lollipop Man":
                if (this.lollipopMan < 1) {
                    lollipopMan++;
                }
                break;
        }
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

    public void addMember(){
        this.teamMembers = teamMembers++;
    }

    @Override
    public void removeWheelNut(RaceCar car) {
        car.setTheWheelNutOn(false);
    }

    @Override
    public void putWheelNutBackOn(RaceCar car) {
        car.setTheWheelNutOn(true);
    }

    @Override
    public void removeTyres(RaceCar car) {
        car.setTyresOn(false);
    }

    @Override
    public void putTyresBackOn(RaceCar car) {
        car.setTyresOn(true);
        car.setFrontLifted(false);
        car.setBackLifted(false);
        car.setAreSidesLifted(false);
        car.setTheWheelNutOn(true);
    }

    @Override
    public void liftFront(RaceCar car) {
        car.setFrontLifted(true);
    }

    @Override
    public void liftBack(RaceCar car) {
        car.setBackLifted(true);
    }

    @Override
    public void liftSides(RaceCar car) {
        car.setAreSidesLifted(true);
    }

    @Override
    public void adjustFrontWing(RaceCar car) {
        car.setFrontWingAdjusted(true);
    }

    @Override
    public void giveSignalToReleaseTheCar(RaceCar car) {
        car.setState("The car is in movement");
        car.setFrontWingAdjusted(false);
    }
}
