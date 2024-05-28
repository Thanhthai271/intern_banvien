package date20240528;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HaangSanXuat haangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien,HaangSanXuat haangSanXuat){
        this.loaiPhuongTien = loaiPhuongTien;
        this.haangSanXuat = haangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String layTenHangSanXuat(){
        return this.haangSanXuat.getTenHangSanXuat();
    }

    public void batDau(){
        System.out.println("Khoi Dong");
    }

    public void tangToc(){
        System.out.println("Bat dau tang toc");
    }

    public void dungLai(){
        System.out.println("Da dung lai");
    }

    public abstract double layVantoc();
}
