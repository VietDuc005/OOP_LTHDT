package Buoi2;

abstract class DongVat {
    abstract void keu(); // phương thức trừu tượng (không code sẵn)

    public void an() { // phương thức bình thường
        System.out.println("Động vật đang ăn...");
    }
}

class Cho extends DongVat {
    @Override
    void keu() {
        System.out.println("Gâu gâu!");
    }
}

class Meo extends DongVat {
    @Override
    void keu() {
        System.out.println("Meo meo!");
    }

    public static void main(String[] args) {
        DongVat cho = new Cho();
        DongVat meo = new Meo();

        cho.keu();
        cho.an();

        meo.keu();
        meo.an();
    }
}
