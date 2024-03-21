public class TeamDriverB extends PitCrewTeam{
    RaceCar carB;

    int frontJack; //1
    int sideJack; //1
    int rearJack; //1
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
}
