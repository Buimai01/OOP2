package lop_va_doi_tuong;

public class lop_date_1 {
    int day, month, year;
    public lop_date_1 (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public String myDate() {
        return this.day+ "-"+ this.month+ "-" + this.year;
    }
}
