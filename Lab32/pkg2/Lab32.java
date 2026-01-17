package lab3.pkg2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author 1000l
 */
public class Lab32 {

    // Cập nhật Scanner để hỗ trợ nhập tiếng Việt (nếu cần)
    static Scanner sc;

    public static void main(String[] args) {
        // --- BẮT ĐẦU PHẦN SỬA LỖI TIẾNG VIỆT ---
        try {
            // Thiết lập đầu ra (System.out) là UTF-8
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
            // Thiết lập đầu vào (Scanner) là UTF-8
            sc = new Scanner(System.in, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Không hỗ trợ UTF-8: " + e.getMessage());
            // Fallback nếu lỗi: dùng mặc định
            sc = new Scanner(System.in); 
        }
        // --- KẾT THÚC PHẦN SỬA LỖI TIẾNG VIỆT ---

        while (true) {
            System.out.println("\n========= MENU LAB 3.2 (TẠO & SỬ DỤNG ĐỐI TƯỢNG) =========");
            System.out.println("1. Bài 1: Student (Xét Đạt/Không Đạt)");
            System.out.println("2. Bài 2: Rectangle (HCN)");
            System.out.println("3. Bài 3: Employee (Tính thuế)");
            System.out.println("4. Bài 4: Circle (Hình tròn lớn/nhỏ)");
            System.out.println("5. Bài 5: BankAccount (Nạp/Rút tiền)");
            System.out.println("6. Bài 6: Product (Giảm giá)");
            System.out.println("7. Bài 7: Car (Tốc độ)");
            System.out.println("8. Bài 8: Book (Sách cũ/đắt)");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài (0-8): ");

            // Kiểm tra xem người dùng có nhập số nguyên không để tránh lỗi trôi lệnh
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine(); // Xử lý trôi lệnh

                switch (choice) {
                    case 1: runBai1(); break;
                    case 2: runBai2(); break;
                    case 3: runBai3(); break;
                    case 4: runBai4(); break;
                    case 5: runBai5(); break;
                    case 6: runBai6(); break;
                    case 7: runBai7(); break;
                    case 8: runBai8(); break;
                    case 0: 
                        System.out.println("Đã thoát chương trình!");
                        System.exit(0);
                    default: System.out.println("Chọn sai, vui lòng chọn lại!");
                }
                
                if (choice != 0) {
                    System.out.println("\n---------------------------------");
                    System.out.println("Ấn Enter để tiếp tục...");
                    sc.nextLine();
                }
            } else {
                // Xử lý trường hợp nhập chữ thay vì số
                System.out.println("Vui lòng nhập số!");
                sc.nextLine(); 
            }
        }
    }

    // ... (Giữ nguyên toàn bộ các class Student, Rectangle, v.v... ở phía dưới của bạn)
    // Dưới đây là ví dụ giữ lại 1 class để code chạy được, bạn ghép code cũ vào nhé:
    
    // ================= BÀI 1: STUDENT =================
    static class Student {
        String id, name;
        double score;

        void input() {
            System.out.print("Nhập ID: "); id = sc.nextLine();
            System.out.print("Nhập Tên: "); name = sc.nextLine();
            System.out.print("Nhập Điểm: "); 
            while(!sc.hasNextDouble()) { // Kiểm tra nhập điểm có phải số không
                System.out.print("Điểm phải là số. Nhập lại: ");
                sc.next();
            }
            score = sc.nextDouble();
            sc.nextLine();
        }

        void display() {
            System.out.println("SV: " + name + " (ID: " + id + ") - Điểm: " + score);
        }

        boolean isPass() {
            return score >= 5.0;
        }
    }

    static void runBai1() {
        System.out.println("--- BÀI 1: STUDENT ---");
        Student s = new Student();
        s.input();
        s.display();

        if (s.isPass()) {
            System.out.println("Kết quả: Sinh viên ĐẠT");
        } else {
            System.out.println("Kết quả: Sinh viên KHÔNG ĐẠT");
        }
    }

    // (Copy tiếp các phần static class Rectangle, Employee... và các hàm runBai2, runBai3... vào đây)
    // ...
    // ...
    
    // (Tôi giả định bạn sẽ dán phần còn lại của code gốc vào đây)
    
     // ================= BÀI 2: RECTANGLE =================
    static class Rectangle {
        double length, width;

        void input() {
            System.out.print("Nhập chiều dài: "); length = sc.nextDouble();
            System.out.print("Nhập chiều rộng: "); width = sc.nextDouble();
        }

        double getArea() { return length * width; }
        double getPerimeter() { return (length + width) * 2; }

        void display() {
            System.out.println("Length: " + length + " – Width: " + width);
        }
    }

    static void runBai2() {
        System.out.println("--- BÀI 2: RECTANGLE ---");
        Rectangle r = new Rectangle();
        r.input();
        r.display();
        System.out.println("Diện tích: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());
    }

    // ================= BÀI 3: EMPLOYEE =================
    static class Employee {
        String id, name;
        double salary;

        void input() {
            System.out.print("Nhập ID: "); id = sc.nextLine();
            System.out.print("Nhập Tên: "); name = sc.nextLine();
            System.out.print("Nhập Lương: "); salary = sc.nextDouble();
        }

        void display() {
            System.out.printf("ID: %s – Name: %s – Salary: %.0f\n", id, name, salary);
        }

        double calculateTax() {
            if (salary > 10000000) return salary * 0.1;
            return 0;
        }
    }

    static void runBai3() {
        System.out.println("--- BÀI 3: EMPLOYEE ---");
        Employee e = new Employee();
        e.input();
        e.display();

        double tax = e.calculateTax();
        if (tax > 0) {
            System.out.printf("Số tiền thuế phải đóng: %.0f VNĐ\n", tax);
        } else {
            System.out.println("Không phải đóng thuế");
        }
    }

    // ================= BÀI 4: CIRCLE =================
    static class Circle {
        double radius;

        void input() {
            System.out.print("Nhập bán kính: "); radius = sc.nextDouble();
        }

        double getArea() { return Math.PI * radius * radius; }
        double getPerimeter() { return 2 * Math.PI * radius; }
        boolean isBigCircle() { return getArea() > 100; }
    }

    static void runBai4() {
        System.out.println("--- BÀI 4: CIRCLE ---");
        Circle c = new Circle();
        c.input();
        System.out.printf("Diện tích: %.2f\n", c.getArea());
        System.out.printf("Chu vi: %.2f\n", c.getPerimeter());

        if (c.isBigCircle()) System.out.println("Kết luận: Hình tròn lớn");
        else System.out.println("Kết luận: Hình tròn nhỏ");
    }

    // ================= BÀI 5: BANK ACCOUNT =================
    static class BankAccount {
        String accountNumber, ownerName;
        double balance;

        public BankAccount(String acc, String owner, double bal) {
            this.accountNumber = acc;
            this.ownerName = owner;
            this.balance = bal;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("-> Đã nạp " + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("-> Đã rút " + amount);
            } else {
                System.out.println("-> Thất bại: Số dư không đủ!");
            }
        }

        double checkBalance() { return balance; }

        void display() {
            System.out.printf("STK: %s – Chủ TK: %s – Số dư: %.0f\n", accountNumber, ownerName, balance);
        }
    }

    static void runBai5() {
        System.out.println("--- BÀI 5: BANK ACCOUNT ---");
        System.out.print("Nhập Số TK: "); String acc = sc.nextLine();
        System.out.print("Nhập Tên Chủ TK: "); String own = sc.nextLine();
        System.out.print("Nhập Số dư đầu: "); double bal = sc.nextDouble();
        
        BankAccount tk = new BankAccount(acc, own, bal);
        tk.display();

        System.out.print("Nhập số tiền cần nạp: ");
        tk.deposit(sc.nextDouble());
        System.out.printf("Số dư hiện tại: %.0f\n", tk.checkBalance());

        System.out.print("Nhập số tiền cần rút: ");
        tk.withdraw(sc.nextDouble());
        System.out.printf("Số dư hiện tại: %.0f\n", tk.checkBalance());
    }

    // ================= BÀI 6: PRODUCT =================
    static class Product {
        String id, name;
        double price;
        int quantity;

        void input() {
            System.out.print("Nhập ID: "); id = sc.nextLine();
            System.out.print("Nhập Tên SP: "); name = sc.nextLine();
            System.out.print("Nhập Giá: "); price = sc.nextDouble();
            System.out.print("Nhập Số lượng: "); quantity = sc.nextInt();
        }

        double getTotalPrice() { return price * quantity; }

        void discount(double percent) {
            price = price * (1 - percent / 100);
        }

        void display() {
            System.out.printf("ID: %s – Name: %s – Price: %.0f – Qty: %d\n", id, name, price, quantity);
        }
    }

    static void runBai6() {
        System.out.println("--- BÀI 6: PRODUCT ---");
        Product p = new Product();
        p.input();
        p.display();
        System.out.println("Tổng tiền: " + p.getTotalPrice());

        System.out.println("--- Áp dụng mã giảm giá 10% ---");
        p.discount(10);
        p.display();
    }

    // ================= BÀI 7: CAR =================
    static class Car {
        String brand, model;
        double speed;

        void input() {
            System.out.print("Nhập hãng xe: "); brand = sc.nextLine();
            System.out.print("Nhập model: "); model = sc.nextLine();
            System.out.print("Nhập tốc độ hiện tại: "); speed = sc.nextDouble();
        }

        void accelerate(int value) { speed += value; }

        void brake(int value) {
            speed -= value;
            if (speed < 0) speed = 0;
        }

        void displayStatus() {
            System.out.println("Model: " + model + " – Speed: " + speed + " km/h");
        }

        boolean isOverSpeed() { return speed > 100; }
    }

    static void runBai7() {
        System.out.println("--- BÀI 7: CAR ---");
        Car c = new Car();
        c.input();

        System.out.println("-> Đạp ga thêm 50km/h...");
        c.accelerate(50);
        c.displayStatus();

        if (c.isOverSpeed()) {
            System.out.println("CẢNH BÁO: Xe đang vượt quá tốc độ cho phép!");
        }

        System.out.println("-> Đạp phanh 20km/h...");
        c.brake(20);
        c.displayStatus();
    }

    // ================= BÀI 8: BOOK =================
    static class Book {
        String title, author;
        double price;
        int year;

        void input() {
            System.out.print("Nhập tên sách: "); title = sc.nextLine();
            System.out.print("Nhập tác giả: "); author = sc.nextLine();
            System.out.print("Nhập giá: "); price = sc.nextDouble();
            System.out.print("Nhập năm XB: "); year = sc.nextInt();
        }

        void display() {
            System.out.printf("Title: %s – Author: %s – Price: %.0f – Year: %d\n", title, author, price, year);
        }

        boolean isExpensive() { return price > 200000; }
        boolean isOldBook() { return year < 2015; }
    }

    static void runBai8() {
        System.out.println("--- BÀI 8: BOOK ---");
        Book b = new Book();
        b.input();
        b.display();

        if (b.isExpensive()) System.out.println("=> Sách có giá cao");
        if (b.isOldBook()) System.out.println("=> Sách xuất bản trước năm 2015");
    }
}