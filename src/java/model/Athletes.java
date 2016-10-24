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
    
        public int getAthleteID() {
        return athleteID;
    }

    public void setAthleteID(int athleteID) {
        this.athleteID = athleteID;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Athletes{" + "athleteID=" + athleteID + ", athleteName=" + athleteName + ", sport=" + sport + ", nationality=" + nationality + ", age=" + age + '}';
    }
    
}
