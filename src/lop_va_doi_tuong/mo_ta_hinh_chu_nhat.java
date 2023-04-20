package lop_va_doi_tuong;

public class mo_ta_hinh_chu_nhat {
    double width, height;
    public mo_ta_hinh_chu_nhat() {
    }
    public mo_ta_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double dientich() {
        return this.width * this.height;
    }
    public double chuvi() {
        return (this.width + this.height) * 2;
    }

}
