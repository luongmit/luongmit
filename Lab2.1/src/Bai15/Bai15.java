/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

/**
 *
 * @author 1000l
 */
import java.util.Scanner;

class SinhVien {
    String hoTen;
    double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
    public String xepLoai() {
        if (diem >= 8.0) return "Gioi";
        if (diem >= 6.5) return "Kha";
        if (diem >= 5.0) return "Trung binh";
        return "Yeu";
    }
}

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        
        SinhVien[] ds = new SinhVien[n];
        double tongDiem = 0;
        
        // Nhập danh sách
        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien thu " + (i + 1) + ":");
            sc.nextLine(); // Xử lý trôi lệnh sau khi nhập số
            
            System.out.print("  Ho ten: ");
            String ten = sc.nextLine();
            
            System.out.print("  Diem: ");
            double diem = sc.nextDouble();
            
            ds[i] = new SinhVien(ten, diem);
            tongDiem += diem;
        }
        
        // Tính toán và hiển thị
        System.out.println("\n--- KET QUA ---");
        double dtb = (n > 0) ? tongDiem / n : 0;
        System.out.printf("Diem trung binh lop: %.2f\n", dtb);
        
        SinhVien maxSV = ds[0];
        System.out.printf("%-20s %-10s %-10s\n", "HO TEN", "DIEM", "XEP LOAI");
        
        for (SinhVien sv : ds) {
            System.out.printf("%-20s %-10.1f %-10s\n", sv.hoTen, sv.diem, sv.xepLoai());
            
            if (sv.diem > maxSV.diem) {
                maxSV = sv;
            }
        }
        
        System.out.println("\nSinh vien diem cao nhat: " + maxSV.hoTen + " (" + maxSV.diem + ")");
    }
}
