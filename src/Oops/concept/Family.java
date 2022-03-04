package Oops.concept;

import java.util.Arrays;

public class Family {
    private String fatherName;
    private String MotherName;
    private String SonName;
    private String DaughterName;
    private int fatherSalary;
    private int MotherSalary;
    private int SonFee;
    private int DaughterFee;

    public Family(String fatherName, String motherName, String sonName, String daughterName, int fatherSalary, int motherSalary, int sonFee, int daughterFee) {
        System.out.println("constructor with parameters is called");
        this.fatherName = "a";
        MotherName = "b";
        SonName = "c";
        DaughterName = "d";
        this.fatherSalary = 130000;
        MotherSalary = 100000;
        SonFee = 2000;
        DaughterFee = 2000;
        int grocery=500;

    }
    public Family(String a, String b, String c, String d) {
    }
    public String displayNames() {
        String s[]={fatherName,MotherName,SonName,DaughterName};
        System.out.println(Arrays.toString(s));
        return displayNames();
    }

    public void setDaughterName(String daughterName) {
        DaughterName = daughterName;
    }

    public int getFatherSalary() {
        return fatherSalary;
    }

    public void setFatherSalary(int fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public int getMotherSalary() {
        return MotherSalary;
    }

    public void setMotherSalary(int motherSalary) {
        MotherSalary = motherSalary;
    }
    public int getTotalSalary(){
        return fatherSalary+MotherSalary;
    }

    public int getSonFee() {
        return SonFee;
    }

    public void setSonFee(int sonFee) {
        SonFee = sonFee;
    }

    public int getDaughterFee() {
        return DaughterFee;
    }

    public void setDaughterFee(int daughterFee) {
        DaughterFee = daughterFee;
    }
    public int getTotalFee(){
        return SonFee+DaughterFee;
    }
    public int getSavings(){
        return getTotalSalary()-getTotalFee();
    }
}
