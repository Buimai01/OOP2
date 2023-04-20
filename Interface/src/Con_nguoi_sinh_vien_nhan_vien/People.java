package Con_nguoi_sinh_vien_nhan_vien;

public abstract class People {
    private String name;
    private int age;
    private boolean gender;
    public People (String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void study();
}
interface Student {
    void registerCourse (String course);
    void attendClass();
}
interface Employee {
    void work();
    void takeBreak();
}
class StudentImpl extends People implements Student {
    public StudentImpl (String name, int age, boolean gender) {
        super(name, age, gender);
    }
    public void eat() {
        System.out.println("Bún đậu");
    }
    public void sleep() {
        System.out.println("8 tiếng / ngày");
    }
    public void study() {
        System.out.println("Đang học");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("CodeGym");
    }

    @Override
    public void attendClass() {
        System.out.println( "D101_C2K14");
    }
}
class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Mai", 19, true);
        student.eat();
        student.sleep();
        student.study();
        student.registerCourse("CodeGym");
        student.attendClass();
    }
}