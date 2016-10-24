package model;

public class Athletes {
    private int athleteID;
    private String athleteName;
    private String sport;
    private String nationality;
    private int age;
    
    public Athletes() {
        this.athleteID = 0;
        this.athleteName = "";
        this.sport = "";
        this.nationality = "";
        this.age = 0;
    }

    public Athletes(int athleteID, String athleteName, String sport, String nationality, int age) {
        this.athleteID = athleteID;
        this.athleteName = athleteName;
        this.sport = sport;
        this.nationality = nationality;
        this.age = age;
    }
    
    
}
