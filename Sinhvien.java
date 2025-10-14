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
      public String getHoTen(){
            return  hoTen;
        }
        public double  getDiem(){
            return diem;
        }
        public void setHoTen(String hoTen){
            this.hoTen = hoTen;
        }
        public void setDiem(double diem){
            this.diem = diem;
        }
    }