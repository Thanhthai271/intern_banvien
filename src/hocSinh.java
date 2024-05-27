public class hocSinh extends connguoi {
protected String maSinhVien;
protected int lop;
    public hocSinh(String hoVaTen, int namSinh, String maSinhVien, int lop) {
        super();
        this.maSinhVien=maSinhVien;
        this.lop=lop;
    }

    public String getMaSinhVien(){
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public int getLop(){
        return this.lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public void dihoc (){
        System.out.println("Tôi đang đi học");
    }
    public void hocbai (){
        System.out.println("Tôi đang học bài");
    }
}
