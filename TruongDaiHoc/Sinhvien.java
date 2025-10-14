public class Sinhvien{
    private String hoTen;
    private double diem;
    
    public Sinhvien(){
        hoTen = "No name";
        diem = 0.0;
    }

    public Sinhvien(String hoTen){
        this.hoTen = hoTen;
    }

    public Sinhvien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void hienThiThongTin(){
        System.out.println(hoTen+ " : "+diem);
    }


    }