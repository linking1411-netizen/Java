public class test{
    public static void main(String[]args){
        NhanVien nv1 = new NhanVien("nhân viên 1","Bắc Ninh",123456789);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("lương nv1 là: "+luongnv1);
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh ("hành chính 1","Thái Nguyên",654321);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("lương hc1 là: "+luonghc1);
        NhanVienDiCa ca1 = new NhanVienDiCa("đi ca 1","Bình Thuận",192837465);
        double luongca1 = ca1.tinhLuong();
        System.out.println("lương dc1 là: "+luongca1);
        NhanVienDiCa ca2 = new NhanVienDiCa("đi ca 2","Hòa Bình",5423456,1);
        double luongca2 = ca2.tinhLuong();
        System.out.println("lương dc2 là: "+luongca2);
}
}