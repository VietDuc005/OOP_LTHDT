public class Bai3 {
    String tantacgia;
    String tentruyen;
    int namxuatban;

    public Bai3(String a, String b, int c) {
        this.tantacgia = a;
        this.tentruyen = b;
        this.namxuatban = c;
    }

    public void Hienthi() {
        System.out
                .println(
                        "Tac gia bo truyen " + tentruyen + "la ong " + tantacgia + ", duoc san xuat nam " + namxuatban);
    }
}
