public class Main {
    public static void main(String[] args) {
        // Ket Qua Tenclass.java
        System.out.println("Ket Qua Tenclass.java: ");
        Tenclass obj = new Tenclass("Nguyen Viet Duc ", 20);
        obj.Hienthi();
        // Ket Qua Bai1: In thong tin Sinh Vien
        System.out.println("Ket Qua Bai1.java: ");
        Bai1 x = new Bai1("Nguyen Viet Duc ", 20, " 10A3");
        Bai1 y = new Bai1("Phan Thuy Dung", 21, "11C9");
        x.Hienthi();
        y.Hienthi();
        // Ket Qua Bai2: Tinh chu vi va dien tich hcn
        System.out.println("Ket Qua Bai2.java: ");
        Bai2 hcn = new Bai2(7, 5);
        System.out.println("chu vi hcn: " + hcn.chuvi());
        System.out.println("dien tich hcn: " + hcn.dientich());
        // Ket Qua Bai3: In thong tin truyen
        System.out.println("Ket qua Bai3.java:");
        Bai3 a = new Bai3("Smile AI", "AI in Education", 2025);
        Bai3 b = new Bai3("John Doe", "The Future of Tech", 2023);
        a.Hienthi();
        b.Hienthi();
    }
}