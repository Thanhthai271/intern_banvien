package date20240529;

public class main {
    public static void main(String[] args) {
        HangHoa hh = new HangHoa(null,null);
        hh.hamnhap();
        hh.hamxuat();

        MayTinh mt = new MayTinh(null,"mt",null,0,0);
            mt.hamnhap();
            mt.hamxuat();
        MayTinh mt1 = new MayTinh(null,null,null,0,0);
            mt1.hamnhap();
            mt1.hamxuat();
        MayTinh mt2 = new MayTinh(null,null,null,0,0);
            mt2.hamnhap();
            mt2.hamxuat();

        System.out.println("Cac may sam sung la : ");
        System.out.println(mt.getMayTinhSamSung());
        System.out.println(mt1.getMayTinhSamSung());
        System.out.println(mt2.getMayTinhSamSung());

        System.out.println("may co gia ban thuc te thap nhat la : " );
        double arr[] = new double[]{mt.tinhGiaBanThucTe(), mt1.tinhGiaBanThucTe(), mt2.tinhGiaBanThucTe()};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (mt.tinhGiaBanThucTe() == arr[0]){
            System.out.println(mt.getTenHang());
        }
        if (mt1.tinhGiaBanThucTe() == arr[0]){
            System.out.println(mt1.getTenHang());
        }
        if (mt2.tinhGiaBanThucTe() == arr[0]){
            System.out.println(mt2.getTenHang());
        }

    }
}
