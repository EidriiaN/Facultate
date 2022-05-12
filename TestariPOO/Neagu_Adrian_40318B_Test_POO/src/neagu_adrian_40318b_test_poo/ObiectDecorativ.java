/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neagu_adrian_40318b_test_poo;

/**
 *
 * @author User
 */
public class ObiectDecorativ {
    
    private String tip;
    protected static String firma;
    private double pret;
    
    public ObiectDecorativ(){
        this.tip=" ";
        this.firma=" ";
        this.pret=0;
    }
    
    public ObiectDecorativ(String tip, String firma, double pret){
        this.tip=tip;
        this.firma=firma;
        this.pret=pret;
    }
    
    public void afisare(){
        System.out.println("Tip(interior/exterior: "+this.tip+"\nFirma: "+this.firma+"\nPret: "+this.pret);
    }
    
    public static void setFirma(String f){
        firma=f;
    }
    
    public void setTip(String t){
        this.tip=t;
    }
    
    public void setPret(double p){
        this.pret=p;
    }
    
    public double getPret(){
        return this.pret;
    }
}
