/*
 * @ # CD.java     1.0     9/10/2024
 *Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.Bai12;

/*
 * @description
 * @author: Thanh Long
 * @date: 9/10/2024
 * @version: 1.0
 */
public class CD {
    private int maCD ;
    private String tuaCD ;
    private int soBaiHat ;
    private double giaThanh ;

    public CD(){
        this(999999 ,"Chua Xac Dinh",0,0.0);
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setmaCD(int maCD) {
        if(maCD < 0) {
            throw new IllegalArgumentException("So nguyen > 0");
        } this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if(tuaCD == null && tuaCD.trim().isEmpty()) {
            throw new IllegalArgumentException("Chuoi khong rong ");
        }
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if(soBaiHat < 0) {
        throw new IllegalArgumentException("So nguyen > 0");
    } this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if(giaThanh < 0) {
            throw new IllegalArgumentException("So Thuc > 0");
        } this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-25s %10s %15s", maCD, tuaCD, soBaiHat, giaThanh);

    }
}
