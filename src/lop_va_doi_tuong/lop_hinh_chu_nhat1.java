package lop_va_doi_tuong;

public class lop_hinh_chu_nhat1 {
    double width, height;
    public lop_hinh_chu_nhat1() {
    }
    public lop_hinh_chu_nhat1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double dientich(){
        return this.width * this.height;
    }
    public double chuvi() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "lop_hinh_chu_nhat1 {"+ "width=" + width + ", height=" + height +"}" ;
    }
}
