package date20240528;public class main {
    public static void main(String[] args) {
        HaangSanXuat h1 = new HaangSanXuat("hang 1", "VietNam");
        HaangSanXuat h2 = new HaangSanXuat("hang 2", "USA");
        HaangSanXuat h3 = new HaangSanXuat("hang 3", "Canada");

        PhuongTienDiChuyen mb = new MayBay("dau", h1);
        PhuongTienDiChuyen oto = new XeOto("Xang", h2);
        PhuongTienDiChuyen xd = new XeDap(h3);

        System.out.println("Lay hangsanxuat ");
        System.out.println("maybay : " + mb.layTenHangSanXuat());

        System.out.println("Bat dau :");
        oto.batDau();

        System.out.println("Lay van toc");
        oto.layVantoc();
        mb.layVantoc();
        xd.layVantoc();
    }
}
