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
    private int grocery=500;

    public Family(){
        System.out.println("constructor with parameters is called");
        this.fatherName = "Shashi";
        MotherName = "Keerthi";
        SonName = "Rishik";
        DaughterName = "Saisha";
        this.fatherSalary = 130000;
        MotherSalary = 100000;
        SonFee = 2000;
        DaughterFee = 2000;
    }
    public void displayNames() {
        String s[]={fatherName,MotherName,SonName,DaughterName};
        System.out.println(Arrays.toString(s));
    }
    public int getTotalSalary(){
        return fatherSalary+MotherSalary;
    }
    public int getTotalFee(){
        return SonFee+DaughterFee;
    }
    public int getSavings(){
        return getTotalSalary()-(getTotalFee()-500);
    }
    public void checkSavings(int savings){
        if(savings>1000){
            System.out.println("Congratulations!!"+ fatherName+"you saved"+""+savings);
        }
        else{
            System.out.println("fatherName"+""+"please try to save more");
        }
    }
}
