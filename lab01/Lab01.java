/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author 1000l
 */
public class Lab01 {

    // Khai báo Scanner (sẽ khởi tạo trong main)
    static Scanner sc;

    public static void main(String[] args) {
        
        // --- CẤU HÌNH HIỂN THỊ TIẾNG VIỆT (UTF-8) ---
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
            sc = new Scanner(System.in, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Lỗi cấu hình UTF-8, dùng mặc định.");
            sc = new Scanner(System.in);
        }
        // ---------------------------------------------

        while (true) {
            System.out.println("\n========= MENU LAB 01 =========");
            System.out.println("1. Bài 1: Tính tổng chuỗi số (Series)");
            System.out.println("2. Bài 2: Mảng 1 chiều cơ bản");
            System.out.println("3. Bài 3: Mảng 2 chiều (Ma trận)");
            System.out.println("4. Bài 4: Xử lý chuỗi (String)");
            System.out.println("5. Bài 5: Mảng động (ArrayList) số nguyên");
            System.out.println("6. Bài 6: Quản lý Sinh Viên (Class)");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài (0-6): ");
            
            // Kiểm tra đầu vào có phải số không
            if (sc.hasNextInt()) {
                int chon = sc.nextInt();
                sc.nextLine(); // Xử lý trôi dòng

                switch (chon) {
                    case 1: runBai1(); break;
                    case 2: runBai2(); break;
                    case 3: runBai3(); break;
                    case 4: runBai4(); break;
                    case 5: runBai5(); break;
                    case 6: runBai6(); break;
                    case 0: 
                        System.out.println("Thoát chương trình.");
                        System.exit(0);
                    default: System.out.println("Chọn sai, vui lòng chọn lại!");
                }
                
                if (chon != 0) {
                    System.out.println("\nẤn Enter để tiếp tục...");
                    sc.nextLine();
                }
            } else {
                System.out.println("Vui lòng nhập số nguyên!");
                sc.nextLine(); // Xóa bộ nhớ đệm
            }
        }
    }

    // BÀI 1: TÍNH TỔNG CÁC CHUỖI SỐ
    static void runBai1() {
        System.out.println("--- BÀI 1: TÍNH TỔNG CHUỖI SỐ ---");
        System.out.print("Nhập n: "); int n = sc.nextInt();
        System.out.print("Nhập x (cho câu 4,5,6): "); double x = sc.nextDouble();

        // 1. S = 1 + 1/2 + ... + 1/n
        double s1 = 0;
        for(int i=1; i<=n; i++) s1 += 1.0/i;
        System.out.printf("1. S = %.2f\n", s1);

        // 2. S = 1/2 + 1/4 + ... + 1/2n
        double s2 = 0;
        for(int i=1; i<=n; i++) s2 += 1.0/(2*i);
        System.out.printf("2. S = %.2f\n", s2);

        // 3. S = 1 + 3 + 5 + ... + (2n+1)
        long s3 = 0;
        for(int i=0; i<=n; i++) s3 += (2*i + 1);
        System.out.printf("3. S = %d\n", s3);

        // 4. S = 1 + x + x^2 + ... + x^n
        double s4 = 0;
        for(int i=0; i<=n; i++) s4 += Math.pow(x, i);
        System.out.printf("4. S = %.2f\n", s4);

        // 5. S = 1 - x^2/2! + x^4/4! - ...
        double s5 = 1;
        for(int i=1; i<=n; i++) {
            double term = Math.pow(x, 2*i) / factorial(2*i);
            if(i % 2 == 1) s5 -= term; else s5 += term;
        }
        System.out.printf("5. S = %.4f\n", s5);

        // 6. S = 1 + x + x^2/2! + ... + x^n/n! (e^x)
        double s6 = 0;
        for(int i=0; i<=n; i++) s6 += Math.pow(x, i) / factorial(i);
        System.out.printf("6. S = %.4f\n", s6);
    }

    static long factorial(int n) {
        long f = 1;
        for(int i=2; i<=n; i++) f *= i;
        return f;
    }

    // BÀI 2: MẢNG 1 CHIỀU
    static void runBai2() {
        System.out.println("--- BÀI 2: MẢNG 1 CHIỀU ---");
        System.out.print("Nhập số phần tử n: "); int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập mảng: ");
        for(int i=0; i<n; i++) a[i] = sc.nextInt();

        System.out.println("Mảng: " + Arrays.toString(a));

        int sum = 0, countNeg = 0;
        int max = a[0], min = a[0];
        for(int val : a) {
            sum += val;
            if(val < 0) countNeg++;
            if(val > max) max = val;
            if(val < min) min = val;
        }
        System.out.println("Tổng: " + sum);
        System.out.println("Số lượng số âm: " + countNeg);

        System.out.print("Các số chính phương: ");
        double sumSCP = 0; int countSCP = 0;
        for(int val : a) {
            if(isPerfectSquare(val)) {
                System.out.print(val + " ");
                sumSCP += val;
                countSCP++;
            }
        }
        System.out.println();
        if(countSCP > 0) System.out.println("TB cộng SCP: " + (sumSCP/countSCP));

        System.out.println("Max: " + max + " - Min: " + min);
        System.out.print("Các số trong khoảng (" + min + ", " + max + "): ");
        for(int val : a) {
            if(val > min && val < max) System.out.print(val + " ");
        }
        System.out.println();
    }

    static boolean isPerfectSquare(int n) {
        if(n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    // BÀI 3: MẢNG 2 CHIỀU (MA TRẬN)
    static void runBai3() {
        System.out.println("--- BÀI 3: MA TRẬN VUÔNG ---");
        System.out.print("Nhập cấp ma trận vuông n: "); int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Nhập ma trận:");
        long sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
                sum += mat[i][j];
            }
        }

        System.out.println("Ma trận:");
        for(int[] row : mat) {
            for(int x : row) System.out.printf("%4d", x);
            System.out.println();
        }
        System.out.println("Tổng các phần tử: " + sum);

        System.out.print("Nhập k (0 đến " + (n-1) + "): "); int k = sc.nextInt();
        if(k >= 0 && k < n) {
            int maxRowK = Integer.MIN_VALUE;
            for(int j=0; j<n; j++) if(mat[k][j] > maxRowK) maxRowK = mat[k][j];
            System.out.println("Max hàng " + k + ": " + maxRowK);

            int countNegColK = 0;
            for(int i=0; i<n; i++) if(mat[i][k] < 0) countNegColK++;
            System.out.println("Số âm cột " + k + ": " + countNegColK);
        }

        System.out.print("SCP chéo chính: ");
        for(int i=0; i<n; i++) if(isPerfectSquare(mat[i][i])) System.out.print(mat[i][i] + " ");
        System.out.println();

        double sumSub = 0; int countSub = 0;
        for(int i=0; i<n; i++) {
            int val = mat[i][n-1-i];
            if(val != 0 && 150 % val == 0) { 
                 sumSub += val; countSub++;
            }
        }
        if(countSub > 0) System.out.println("TB cộng ước 150 chéo phụ: " + (sumSub/countSub));

        System.out.println("Ma trận sau khi sắp xếp hàng giảm dần:");
        for(int i=0; i<n; i++) {
            Arrays.sort(mat[i]); 
            // Đảo ngược mảng để thành giảm dần
            for(int start=0, end=n-1; start<end; start++, end--) {
                int temp = mat[i][start]; mat[i][start] = mat[i][end]; mat[i][end] = temp;
            }
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    // BÀI 4: XỬ LÝ CHUỖI
    static void runBai4() {
        System.out.println("--- BÀI 4: XỬ LÝ CHUỖI ---");
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int sumDigits = 0;
        
        System.out.println("1. Chữ cái: " + s.chars().filter(Character::isLetter).count());
        System.out.println("2. Chữ số: " + s.chars().filter(Character::isDigit).count());
        System.out.println("3. Chèn @: " + s.replace("gmail.com", "@gmail.com"));

        StringBuilder s4 = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            s4.append(s.charAt(i));
            if(i < s.length()-1) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);
                if(Character.isDigit(c1) && (c1-'0')%2==0 && Character.isDigit(c2) && (c2-'0')%2==0) {
                    s4.append("-");
                }
            }
            if(Character.isDigit(s.charAt(i))) sumDigits += (s.charAt(i) - '0');
        }
        System.out.println("4. Chèn '-': " + s4);
        System.out.println("5. Thay thế: " + s.replace("gmail.com", "ctech.edu.vn"));

        String[] words = s.split("\\s+");
        System.out.println("6. Các từ: " + Arrays.toString(words));
        
        String maxWord = "";
        for(String w : words) if(w.length() > maxWord.length()) maxWord = w;
        System.out.println("11. Từ dài nhất: " + maxWord);

        StringBuilder s7 = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) s7.append(Character.toLowerCase(c));
            else if(Character.isLowerCase(c)) s7.append(Character.toUpperCase(c));
            else s7.append(c);
        }
        System.out.println("7. Đảo hoa/thường: " + s7);
        System.out.println("8. Tổng các chữ số trong chuỗi: " + sumDigits);

        StringBuilder s9 = new StringBuilder();
        for(String w : words) {
            if(!w.isEmpty()) {
                s9.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1)).append(" ");
            }
        }
        System.out.println("9. Hoa đầu từ: " + s9.toString().trim());
        System.out.println("10. Đảo ngược: " + new StringBuilder(s).reverse().toString());
    }

    // BÀI 5: MẢNG ĐỘNG (ARRAYLIST)
    static void runBai5() {
        System.out.println("--- BÀI 5: ARRAYLIST SỐ NGUYÊN ---");
        System.out.print("Nhập số phần tử: "); int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Nhập các phần tử:");
        for(int i=0; i<n; i++) list.add(sc.nextInt());

        System.out.println("Mảng: " + list);
        if(!list.isEmpty()) System.out.println("Min: " + Collections.min(list));
        
        int sum = 0; for(int x : list) sum += x;
        System.out.println("Tổng: " + sum);

        System.out.print("Nhập k để xóa (index): "); int k = sc.nextInt();
        if(k >=0 && k < list.size()) list.remove(k);
        System.out.println("Sau xóa: " + list);

        System.out.print("Nhập x và k để thêm: ");
        int x = sc.nextInt();
        k = sc.nextInt();
        if(k >=0 && k < list.size()) list.add(k+1, x);
        else list.add(x); 
        System.out.println("Sau thêm: " + list);

        list.sort(Collections.reverseOrder());
        System.out.println("Sắp xếp giảm: " + list);

        if(!list.isEmpty()) {
            int maxVal = Collections.max(list);
            list.removeIf(val -> val == maxVal);
            System.out.println("Sau khi xóa hết số Max ("+maxVal+"): " + list);
        }
    }

    // BÀI 6: QUẢN LÝ SINH VIÊN
    static class SinhVien {
        String maSV, hoTen, lop;
        double diem;

        public SinhVien(String maSV, String hoTen, String lop, double diem) {
            this.maSV = maSV; this.hoTen = hoTen; this.lop = lop; this.diem = diem;
        }

        @Override
        public String toString() {
            return String.format("%-10s %-20s %-10s %.2f", maSV, hoTen, lop, diem);
        }
    }

    static void runBai6() {
        ArrayList<SinhVien> ds = new ArrayList<>();
        System.out.println("--- BÀI 6: QUẢN LÝ SINH VIÊN ---");
        
        while(true) {
            System.out.println("\n--- MENU SINH VIÊN ---");
            System.out.println("1. Nhập DS  2. Hiển thị  3. Tìm theo lớp  4. Tìm Lớp & Điểm>5");
            System.out.println("5. SV điểm cao nhất  6. Thêm SV cuối  7. Thêm sau k  8. Xóa tại k");
            System.out.println("9. Sắp xếp điểm giảm  10. Chuyển lớp  11. Top 1 Lớp  12. Xóa cuối  0. Về menu chính");
            System.out.print("Chọn chức năng SV: ");
            
            if(sc.hasNextInt()) {
                int chon = sc.nextInt(); sc.nextLine();
                if(chon == 0) break;

                switch(chon) {
                    case 1:
                        System.out.print("Nhập số lượng SV: "); int n = sc.nextInt(); sc.nextLine();
                        for(int i=0; i<n; i++) ds.add(nhapSV());
                        break;
                    case 2:
                        System.out.println("DANH SÁCH SINH VIÊN:");
                        System.out.printf("%-10s %-20s %-10s %s\n", "Mã", "Họ Tên", "Lớp", "Điểm");
                        for(SinhVien sv : ds) System.out.println(sv);
                        break;
                    case 3:
                        System.out.print("Nhập lớp cần tìm: "); String lopTim = sc.nextLine();
                        for(SinhVien sv : ds) if(sv.lop.equalsIgnoreCase(lopTim)) System.out.println(sv);
                        break;
                    case 4:
                        System.out.print("Nhập lớp: "); String lopLoc = sc.nextLine();
                        System.out.print("Nhập điểm sàn: "); double diemSan = sc.nextDouble(); sc.nextLine();
                        for(SinhVien sv : ds) if(sv.lop.equalsIgnoreCase(lopLoc) && sv.diem > diemSan) System.out.println(sv);
                        break;
                    case 5:
                        if(ds.isEmpty()) break;
                        double maxDiem = ds.get(0).diem;
                        for(SinhVien sv : ds) if(sv.diem > maxDiem) maxDiem = sv.diem;
                        System.out.println("SV điểm cao nhất (" + maxDiem + "):");
                        for(SinhVien sv : ds) if(sv.diem == maxDiem) System.out.println(sv);
                        break;
                    case 6:
                        System.out.println("Nhập SV mới:");
                        ds.add(nhapSV());
                        break;
                    case 7:
                        System.out.print("Nhập vị trí k muốn chèn sau: "); int k = sc.nextInt(); sc.nextLine();
                        System.out.println("Nhập SV mới:");
                        if(k >= 0 && k < ds.size()) ds.add(k+1, nhapSV());
                        break;
                    case 8:
                        System.out.print("Nhập vị trí k muốn xóa: "); int kXoa = sc.nextInt(); sc.nextLine();
                        if(kXoa >= 0 && kXoa < ds.size()) ds.remove(kXoa);
                        break;
                    case 9:
                        ds.sort((s1, s2) -> Double.compare(s2.diem, s1.diem));
                        System.out.println("Đã sắp xếp giảm dần theo điểm.");
                        break;
                    case 10:
                        System.out.print("Nhập lớp mới: "); String lopMoi = sc.nextLine();
                        System.out.print("Nhập mã SV cần chuyển: "); String maChuyen = sc.nextLine();
                        for(SinhVien sv : ds) if(sv.maSV.equalsIgnoreCase(maChuyen)) sv.lop = lopMoi;
                        break;
                    case 11:
                        System.out.print("Nhập lớp: "); String lopTop = sc.nextLine();
                        double maxLop = -1;
                        for(SinhVien sv : ds) if(sv.lop.equalsIgnoreCase(lopTop) && sv.diem > maxLop) maxLop = sv.diem;
                        if(maxLop != -1) {
                            for(SinhVien sv : ds) if(sv.lop.equalsIgnoreCase(lopTop) && sv.diem == maxLop) System.out.println(sv);
                        }
                        break;
                    case 12:
                        if(!ds.isEmpty()) ds.remove(ds.size()-1);
                        System.out.println("Đã xóa SV cuối cùng.");
                        break;
                }
            } else {
                 System.out.println("Vui lòng nhập số!");
                 sc.nextLine();
            }
        }
    }

    static SinhVien nhapSV() {
        System.out.print("Mã SV: "); String ma = sc.nextLine();
        System.out.print("Họ tên: "); String ten = sc.nextLine();
        System.out.print("Lớp: "); String lop = sc.nextLine();
        System.out.print("Điểm: "); 
        // Kiểm tra nhập điểm
        while(!sc.hasNextDouble()) {
            System.out.print("Điểm phải là số. Nhập lại: ");
            sc.next();
        }
        double diem = sc.nextDouble(); sc.nextLine();
        return new SinhVien(ma, ten, lop, diem);
    }
}