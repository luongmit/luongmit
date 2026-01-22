/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author 1000l
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    String maSV;
    String hoTen;
    String lop;
    double diem;

    public SinhVien(String maSV, String hoTen, String lop, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem = diem;
    }

    public void display() {
        System.out.printf("%-10s %-20s %-10s %-5.2f\n", maSV, hoTen, lop, diem);
    }
}

public class Bai6{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        ds.add(new SinhVien("SV01", "Tran Gia Luong", "CNTT-K14", 8.5));
        ds.add(new SinhVien("SV02", "Le Thi B", "CNTT-K15", 4.0));
        ds.add(new SinhVien("SV03", "Tran Van C", "CNTT-K16", 9.0));

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Hien thi SV thuoc lop...");
            System.out.println("3. Hien thi SV lop... co diem > 5");
            System.out.println("4. Hien thi SV diem cao nhat");
            System.out.println("5. Them SV moi (cuoi/giua)");
            System.out.println("6. Xoa SV");
            System.out.println("7. Sap xep giam dan diem");
            System.out.println("8. Chuyen lop");
            System.out.println("9. SV diem cao nhat cua lop...");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: hienThiDS(ds); break;
                case 2: locTheoLop(); break;
                case 3: locTheoLopVaDiem(); break;
                case 4: timMaxDiemToanTruong(); break;
                case 5: themSinhVien(); break; 
                case 6: xoaSinhVien(); break;
                case 7: 
                    ds.sort((sv1, sv2) -> Double.compare(sv2.diem, sv1.diem));
                    System.out.println("Da sap xep!");
                    hienThiDS(ds);
                    break;
                case 8: chuyenLop(); break;
                case 9: timMaxDiemCuaLop(); break;
                case 0: return;
                default: System.out.println("Chon sai!");
            }
        }
    }

    static void hienThiDS(ArrayList<SinhVien> list) {
        System.out.printf("%-10s %-20s %-10s %-5s\n", "MASV", "HO TEN", "LOP", "DIEM");
        for (SinhVien sv : list) sv.display();
    }

    static void locTheoLop() {
        System.out.print("Nhap ten lop: ");
        String lop = sc.nextLine();
        for (SinhVien sv : ds) if (sv.lop.equalsIgnoreCase(lop)) sv.display();
    }

    static void locTheoLopVaDiem() {
        System.out.print("Nhap lop: "); String lop = sc.nextLine();
        System.out.print("Nhap diem san: "); double d = sc.nextDouble();
        for (SinhVien sv : ds) 
            if (sv.lop.equalsIgnoreCase(lop) && sv.diem > d) sv.display();
    }

    static void timMaxDiemToanTruong() {
        if (ds.isEmpty()) return;
        double max = -1;
        for (SinhVien sv : ds) if (sv.diem > max) max = sv.diem;
        System.out.println("Sinh vien diem cao nhat (" + max + "):");
        for (SinhVien sv : ds) if (sv.diem == max) sv.display();
    }

    static void themSinhVien() {
        System.out.println("Nhap: Ma, Ten, Lop, Diem:");
        String ma = sc.nextLine(); String ten = sc.nextLine();
        String lop = sc.nextLine(); double diem = sc.nextDouble();
        SinhVien svMoi = new SinhVien(ma, ten, lop, diem);

        System.out.println("1. Them vao cuoi");
        System.out.println("2. Them vao sau vi tri k");
        int opt = sc.nextInt();
        if (opt == 1) ds.add(svMoi);
        else {
            System.out.print("Nhap k: "); int k = sc.nextInt();
            if (k >= 0 && k < ds.size()) ds.add(k + 1, svMoi);
        }
    }

    static void xoaSinhVien() {
        System.out.println("1. Xoa vi tri k");
        System.out.println("2. Xoa vi tri cuoi cung");
        int opt = sc.nextInt();
        if (opt == 2 && !ds.isEmpty()) ds.remove(ds.size() - 1);
        else {
            System.out.print("Nhap k: "); int k = sc.nextInt();
            if (k >= 0 && k < ds.size()) ds.remove(k);
        }
    }

    static void chuyenLop() {
        System.out.print("Nhap lop moi: "); String lopMoi = sc.nextLine();
        System.out.print("Nhap MaSV can chuyen: "); String ma = sc.nextLine();
        for (SinhVien sv : ds) {
            if (sv.maSV.equalsIgnoreCase(ma)) {
                sv.lop = lopMoi;
                System.out.println("Da chuyen lop thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay SV.");
    }

    static void timMaxDiemCuaLop() {
        System.out.print("Nhap lop: "); String lop = sc.nextLine();
        double max = -1;
        boolean found = false;
        for (SinhVien sv : ds) {
            if (sv.lop.equalsIgnoreCase(lop)) {
                if (sv.diem > max) max = sv.diem;
                found = true;
            }
        }
        if (found) {
            System.out.println("Thu khoa cua lop " + lop + ":");
            for (SinhVien sv : ds) 
                if (sv.lop.equalsIgnoreCase(lop) && sv.diem == max) sv.display();
        } else {
            System.out.println("Lop khong co sinh vien.");
        }
    }
}