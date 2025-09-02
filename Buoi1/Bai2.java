class Bai2 {
    double chieudai, chieurong;

    Bai2(double a, double b) {
        chieudai = a;
        chieurong = b;
    }

    public double chuvi() {
        return 2 * (chieudai + chieurong);
    }

    public double dientich() {
        return chieudai * chieurong;
    }
}
