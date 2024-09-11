/*
 * @ # ListCD.java     1.0     9/10/2024
 *Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.Bai12;

/*
 * @description
 * @author: Thanh Long
 * @date: 9/10/2024
 * @version: 1.0
 */

import java.util.Arrays;
import java.util.Comparator;

public class ListCD {
   public CD[] danhSach ;
   public int dem = 0;

   public ListCD( int n){
       if(n < 0){
           throw new RuntimeException("N phia lon hon 0");
       } danhSach = new CD[n];
   }

   public void ThemCD( CD cd){
       if( cd == null){
           throw new RuntimeException("Chuoi khong rong");
       }
       for( int i = 0 ; i< dem ; i++){
           CD temp = danhSach[i];
           if(temp.getMaCD()== cd.getMaCD()){
               throw new RuntimeException("Khong Dc trung");
           }
       }
       if(dem == danhSach.length){
           int newlength = ( int)(danhSach.length*1.5);
           CD[] temp = new CD[newlength];
           for( int i = 0 ;i< dem ;i ++){
               temp[i] = danhSach[i] ;
           }
                danhSach = temp;
       }    danhSach[dem++] = cd;
   }

    public int TimCD(int MACD){
       for( int i = 0 ; i< dem ; i++){
           CD temp = danhSach[i] ;
           if(temp.getMaCD() == MACD){
               return i  ;
           }
       } return -1;
    }

   public void XoaCD( int MACD){
       int a = TimCD(MACD);
       if(a >= 0 ){
           for( int i =a ;  i< dem -1; i++){
               danhSach[i] = danhSach[i+1];
           }
           danhSach[dem -1] = null;
           dem -- ;
       }

   }
    public int TongCD(){
       int d = 0 ;
       for( int i = 0 ; i< dem ; i++){
           if(danhSach[i].getMaCD() > 0){
               d++ ;
           }
       } return d ;
    }


    public void inDanhSach(){
       for( int i = 0 ; i < dem ;i++){
           System.out.println(danhSach[i]);
       }
    }

    public CD[] SXdanhSachMaCD(){
        CD[] a = Arrays.copyOf(danhSach,dem);
        Arrays.sort(a, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return Integer.compare(o2.getMaCD(), o1.getMaCD());
            }
        });
        return a ;
    }

   public CD[] SXtuaCD(){
       CD[] a = Arrays.copyOf(danhSach,dem) ;
       Arrays.sort(a, new Comparator<CD>() {
           @Override
           public int compare(CD o1, CD o2) {
               return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
           }
       }); return a;
   }

   public double TongGT(){
       int d = 0 ;
       for( int i = 0 ; i< dem ; i++){
           if(danhSach[i].getGiaThanh() > 0){
               d += danhSach[i].getGiaThanh();
           }
       } return d ;
   }

   public CD[] SXgiaThanhGiam(){
       CD[] a = Arrays.copyOf(danhSach,dem) ;
       Arrays.sort(a, new Comparator<CD>() {
           @Override
           public int compare(CD o1, CD o2) {
               return Double.compare(o2.getGiaThanh(),o1.getGiaThanh());
           }
       }); return a ;
   }





}