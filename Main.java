public class Main {
    public static void main(String[] args) {
        RaceCar carA = new RaceCar("Lucas","Emotional support from the radio");
        RaceCar carB = new RaceCar("Santiago", "A sip of water at the Pit Stop");
        TeamDriverB persona = new TeamDriverB("frontJack", 123, 'b', carB);
        TeamDriverB persona2 = new TeamDriverB("lollipop", 123, 'a', carA);
        persona.adjustFrontWing(carB);
    }
}