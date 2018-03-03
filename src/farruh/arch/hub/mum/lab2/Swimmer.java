package farruh.arch.hub.mum.lab2;

public class Swimmer {
    private String fname, lname, club;
    private int age;
    private double time;

    public Swimmer(String tmpfname, String tmplname, String tmpclub, int tmpage, double tmptime) {
        fname = tmpfname;
        lname = tmplname;
        club = tmpclub;
        age = tmpage;
        time = tmptime;
    }

    public int getAge() {
        return age;
    }

    public double getTime() {
        return time;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getClub() {
        return club;
    }
}
