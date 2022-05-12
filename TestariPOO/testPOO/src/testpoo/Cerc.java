/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpoo;

import static java.lang.Math.*;

/**
 *
 * @author User
 */
public class Cerc {

    private double raza, x, y;

    public Cerc() {
        raza = 0;
        x = 0;
        y = 0;
    }

    public Cerc(double raza, double x, double y) {
        this.raza = raza;
        this.x = x;
        this.y = y;
    }

    public Cerc(Cerc b) {
        this.raza = b.raza;
        this.x = b.x;
        this.y = b.y;
    }

    public void afisare() {
        System.out.println("Raza=" + raza + "\nx=" + x + "\ny=" + y);
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public double lungime() {
        return 2 * 3.14 * raza;
    }

    public double aria() {
        return 3.14 * raza * raza;
    }

    public double distanta(Cerc b) {
        if (Math.sqrt((b.x - x) * (b.x - x) + (b.y - y) * (b.y - y)) == 0) {
            return 0;
        } else {
            return Math.sqrt((b.x - x) * (b.x - x) + (b.y - y) * (b.y - y));
        }
    }

    public boolean exterioare(Cerc b) {
        if (Math.sqrt((b.x - x) * (b.x - x) + (b.y - y) * (b.y - y)) > raza + b.raza) {
            return true;
        } else {
            return false;
        }
    }

    public boolean concentrice(Cerc b) {
        if (Math.sqrt((b.x - x) * (b.x - x) + (b.y - y) * (b.y - y)) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
