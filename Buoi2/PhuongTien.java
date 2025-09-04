package Buoi2;

interface PhuongTien {
    void chay(); // tất cả phương thức trong interface mặc định là abstract
}

class XeMay implements PhuongTien {
    public void chay() {
        System.out.println("Xe máy chạy bằng xăng...");
    }
}

class OTo implements PhuongTien {
    public void chay() {
        System.out.println("Ô tô chạy bằng xăng hoặc điện...");
    }

    public class Main {
        public static void main(String[] args) {
            PhuongTien xm = new XeMay();
            PhuongTien oto = new OTo();

            xm.chay();
            oto.chay();
        }
    }
}
