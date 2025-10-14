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
    public double tinhDTB( double diemtoan, double diemvan){
        return((diemtoan+diemvan)/2);
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
        public String toSrting(){
        return hoTen; }
        private boolean checkDiem(){
            return this.diem >= 24;
        }
        public void checkDiemHopLe  (){
            if (checkDiem()){
                System.out.println("Điểm hợp lệ, tiếp tục nhập thông tin");
            } else {
                System.out.println("Kiểm tra lại đầu vào của sinh viên");
            }
        }
    }