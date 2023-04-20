package on_bai_tap;

public class Student {
    public String studentCode;
    public String studentName;
    public boolean gender;
    public int age;
    public Student () {
        this.studentCode = "HS0000";
        this.studentName = "Chưa có tên";
        this.gender =true;
        this.age = 0;
    }
    public Student(String studentCode) {
        this.studentCode = studentCode;
        this.studentName = "Chưa có tên";
        this.gender =true;
        this.age = 0;
    }
    public Student(String studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.gender = true;
        this.age = 0;
    }
    public Student(String studentCode, String studentName, boolean gender) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.gender = gender;
        this.age = 0;
    }
    public Student(String studentCode, String studentName, boolean gender, int age){
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.gender = gender;
        this.age = age;
    }
    public String getStudentCode() {
        return this.studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public boolean isGender() {
        return this.gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
class AppStudent {
    public static void main(String[] args) {
        Student objHS1 = new Student();
        objHS1.setStudentCode("HS00001");
        objHS1.setStudentName("Nguyễn Văn Nam");
        objHS1.setAge(15);
        System.out.println("Student code:" + objHS1.getStudentCode());
        System.out.println("Student name:" + objHS1.getStudentName());
        System.out.println("Age:" + objHS1.getAge());
        System.out.println("Gender:" + (objHS1.isGender()?"nam":"nữ"));
        Student objHS2 = new Student("HS0002");
        objHS2.setStudentName("Phạm Thanh Mai");
        objHS2.setGender(false);
        System.out.println("Student code:" + objHS2.getStudentCode());
        System.out.println("Student name:" + objHS2.getStudentName());
        System.out.println("Age:" + objHS2.getAge());
        System.out.println("Gender:" + (objHS2.isGender()?"nam":"nữ"));
    }

}
