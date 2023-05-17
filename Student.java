import java.io.*;
import java.util.Arrays;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String classRoom;
    public Student() {
    }

    public Student(int id, String name, int age, String classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
class StudentProcess {
    public  boolean writeStudent(Student objStudent, String fileName) throws IOException {
     try {
         FileOutputStream fos = new FileOutputStream(fileName);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(objStudent);
         oos.close();
         fos.close();
         return true;
     }catch (IOException m) {
         m.printStackTrace();
         return false;
     }
    }
    public Student readStudent (String fileName) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student objStudent = (Student) ois.readObject();
            System.out.println((char) ois.readObject());
            ois.close();
            fis.close();
            return objStudent;
        }catch (IOException m) {
            System.out.println(m);
            return null;
        }
    }
}
class StudentApp {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Nguyễn Văn A", 19, "D101C2");
        students[1] = new Student(2, "Nguyễn Văn B", 19, "D101C2");
        students[2] = new Student(3, "Nguyễn Văn C", 19, "D101C2");
        students[3] = new Student(4, "Nguyễn Văn D", 19, "D101C2");
        students[4] = new Student(5, "Nguyễn Văn E", 19, "D101C2");
        String fileName = "D:\\Java\\untitled\\Vao_ra_du_lieu2\\src\\student.txt";
        StudentProcess studentProcess = new StudentProcess();
        studentProcess.writeStudent(students[0],fileName);
        studentProcess.writeStudent(students[1], fileName);
        studentProcess.writeStudent(students[2], fileName);
        studentProcess.writeStudent(students[3], fileName);
        studentProcess.writeStudent(students[4], fileName);
        for (Student a:students
             ) {
            System.out.println(a);
        }
        studentProcess.readStudent(fileName);
        System.out.println("Đã ghi dữ liệu thành công vào file" + fileName);
    }
}

