package Buoi2;

class Taikhoannganhang {
    private double soDu;

    public Taikhoannganhang(double soDubandau) {
        this.soDu = soDubandau;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("da nap " + soTien + " vao tai khoan thanh cong");
        } else {
            System.out.println("so tien nap vao khong hop le");
        }

    }

    public void rutTien(double soTien) {
        if (soTien > 0) {
            this.soDu -= soTien;
            System.out.println("da rut " + soTien + " tu tai khoan thanh cong");
        } else {
            System.out.println("so tien rut ra khong hop le");
        }
    }

    public double getsoDu() {
        return this.soDu;
    }

    public static void main(String[] args) {
        Taikhoannganhang tk = new Taikhoannganhang(3000000);
        tk.napTien(500000);
        tk.rutTien(2000000);
        System.out.println("So du tai khoan hien tai: " + tk.getsoDu());
    }

}
