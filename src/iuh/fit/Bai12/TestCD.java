/*
 * @ # TestCD.java     1.0     9/10/2024
 *Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.Bai12;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * @description
 * @author: Thanh Long
 * @date: 9/10/2024
 * @version: 1.0
 */
public class TestCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListCD danhSach = new ListCD(3) ;
        khoitaodulieu(danhSach);
        int chon = 0 ;
        do{
            System.out.println("Moi Chon\n" +
                    "1.Them vao CD\n" +
                    "2.Xoa CD\n" +
                    "3.Tinh Tong CD\n" +
                    "4.In CD\n" +
                    "5.Sap Xep theo MaCD giam \n" +
                    "6.Sap Xep theo TuaCD Tang\n" +
                    "7.Tong Gia Thanh\n" +
                    "8.Sap Xep Gia Thanh Giam\n" +
                    "9.Tim kiem theo ma CD\n" +
                    "10. Thoat\n");
            chon = sc.nextInt();
            switch (chon){
                case 1->{

                    CD a = new CD();
                    danhSach.ThemCD(a);

                    System.out.println("nhap vao MA CD");
                    a.setmaCD(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Nhap vao Tua CD");
                    a.setTuaCD(sc.nextLine());

                    System.out.println("Nhap vao so BH ");
                    a.setSoBaiHat(sc.nextInt());

                    System.out.println("Nhap vao Gia Thanh");
                    a.setGiaThanh(sc.nextDouble());

                }
                case 2->{
                    System.out.println("Nhap vao ma Xoa CD");
                    int a = sc.nextInt();
                    danhSach.XoaCD(a);
                }
                case 3 -> {
                    System.out.println("Tong CD "+ danhSach.TongCD());
                }
                case 4 ->{
                    System.out.println("Danh Sach CD\n");
                    danhSach.inDanhSach();

                }case 5 ->{
                    CD[] a = danhSach.SXdanhSachMaCD();
                    for(CD b : a){
                        System.out.println(b);
                    }
                }
                case 6 ->{
                    CD[] a= danhSach.SXtuaCD();
                    for(CD b: a){
                        System.out.println(b);
                    }
                }case 7 ->{
                    System.out.println("Tong Gia Thanh "+danhSach.TongGT());
                }
                case 8 ->{
                    CD[] a = danhSach.SXgiaThanhGiam();
                    for(CD b : a){
                        System.out.println(b);
                    }

                } case 9 -> {
                    System.out.println("Nhap vao ma CD can tim:");
                    int maCD = sc.nextInt();
                    int index = danhSach.TimCD(maCD);
                    if (index >= 0) {
                        System.out.println("Thong tin CD co ma " + maCD + ":");
                        System.out.println(danhSach.danhSach[index]); // Giả định getDSCD() trả về danh sách CD
                    } else {
                        System.out.println("Khong tim thay CD voi ma " + maCD);
                    }
                }


            }


        }while(chon >0  && chon < 10);
    }

    private static void khoitaodulieu(ListCD danhSach){
        danhSach.ThemCD(new CD(1001, "1Mua xuan den ", 10, 150000.0));
        danhSach.ThemCD(new CD(1002, "2Mua ha den", 10, 140000.0));
        danhSach.ThemCD(new CD(1003, "3Mua thu den", 10, 120000.0));
        danhSach.ThemCD(new CD(1004, "4Mua dong den", 10, 170000.0));

    }
}