package Buoi2;

class NhanVien {
    String ten; // thuộc tính public (bình thường)
    private double luong; // thuộc tính private (chỉ được truy cập qua getter/setter)

    // Constructor
    public NhanVien(String ten, double luong) {
        this.ten = ten;
        setLuong(luong); // dùng setter để kiểm tra lương hợp lệ
    }

    // Getter
    public double getLuong() {
        return this.luong;
    }

    // Setter
    public void setLuong(double luong) {
        if (luong >= 0) {
            this.luong = luong;
        } else {
            System.out.println("⚠️ Lương không hợp lệ! Giữ nguyên lương cũ.");
        }
    }

    // Method in thông tin nhân viên
    public void inThongTin() {
        System.out.println("Tên nhân viên: " + ten + ", Lương: " + luong);
    }

    public class Main {
        public static void main(String[] args) {
            // Tạo nhân viên
            NhanVien nv1 = new NhanVien("Nguyễn Văn A", 1000);
            nv1.inThongTin();

            // Thay đổi lương hợp lệ
            nv1.setLuong(1500);
            nv1.inThongTin();

            // Thử set lương âm
            nv1.setLuong(-500);
            nv1.inThongTin();
        }
    }
}
