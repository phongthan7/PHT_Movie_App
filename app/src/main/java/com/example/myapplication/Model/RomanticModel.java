package com.example.myapplication.Model;

public class RomanticModel {
    String Rcast;
    String Rcountry;
    String Rdesc;
    String Reps;
    String Rlength;
    String Rrating;
    String Rthumb;
    String Rtitle;
    String Rcover;
    String Rlink;

    public RomanticModel() {}

    public RomanticModel(String rcast, String rcountry, String rdesc, String reps,
                         String rlength, String rrating, String rthumb, String rtitle,String rcover,String rlink) {
        Rcast = rcast;
        Rcountry = rcountry;
        Rdesc = rdesc;
        Reps = reps;
        Rlength = rlength;
        Rrating = rrating;
        Rthumb = rthumb;
        Rtitle = rtitle;
        Rcover = rcover;
        Rlink = rlink;
    }

    public String getRcover() {
        return Rcover;
    }

    public void setRcover(String rcover) {
        Rcover = rcover;
    }

    public String getRlink() {
        return Rlink;
    }

    public void setRlink(String rlink) {
        Rlink = rlink;
    }

    public String getRcast() {
        return Rcast;
    }

    public void setRcast(String rcast) {
        Rcast = rcast;
    }

    public String getRcountry() {
        return Rcountry;
    }

    public void setRcountry(String rcountry) {
        Rcountry = rcountry;
    }

    public String getRdesc() {
        return Rdesc;
    }

    public void setRdesc(String rdesc) {
        Rdesc = rdesc;
    }

    public String getReps() {
        return Reps;
    }

    public void setReps(String reps) {
        Reps = reps;
    }

    public String getRlength() {
        return Rlength;
    }

    public void setRlength(String rlength) {
        Rlength = rlength;
    }

    public String getRrating() {
        return Rrating;
    }

    public void setRrating(String rrating) {
        Rrating = rrating;
    }

    public String getRthumb() {
        return Rthumb;
    }

    public void setRthumb(String rthumb) {
        Rthumb = rthumb;
    }

    public String getRtitle() {
        return Rtitle;
    }

    public void setRtitle(String rtitle) {
        Rtitle = rtitle;
    }
}
