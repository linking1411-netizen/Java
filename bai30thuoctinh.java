
public class bai30thuoctinh{
    public static void main(String[]args){
        Sinhvien sv1 = new Sinhvien();
        Sinhvien sv2 = new Sinhvien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        Sinhvien sv3 = new Sinhvien("Tèo");
        sv3.hienThiThongTin();
        Sinhvien sv4 = new Sinhvien("Tí",9.5);
        sv4.hienThiThongTin();
    }
}