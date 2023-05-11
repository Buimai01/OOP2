import java.io.*;

public class Sinh_vien implements Serializable {
    private int id;
    private String name;
    private double pointmath;
    private double pointphysical;
    private double pointchemistry;

    public Sinh_vien() {
    }

    public Sinh_vien(int id, String name, double pointmath, double pointphysical, double pointchemistry) {
        this.id = id;
        this.name = name;
        this.pointmath = pointmath;
        this.pointphysical = pointphysical;
        this.pointchemistry = pointchemistry;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPointmath() {
        return pointmath;
    }

    public double getPointphysical() {
        return pointphysical;
    }

    public double getPointchemistry() {
        return pointchemistry;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPointmath(double pointmath) {
        this.pointmath = pointmath;
    }

    public void setPointphysical(double pointphysical) {
        this.pointphysical = pointphysical;
    }

    public void setPointchemistry(double pointchemistry) {
        this.pointchemistry = pointchemistry;
    }


    public String toString() {
        return "Thông tin sinh viên: "
                + "Mã sinh viên:"
                + id + "\n"
                + "Tên sinh viên :"
                + name + "\n"
                + "Điểm toán:"
                + pointmath + "\n"
                + "Điểm lý:"
                + pointphysical + "\n"
                + "Điểm hóa:"
                + pointchemistry;
    }


}
 class ObjectOutPut_InputStream  {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\testsv.txt"));
            String line;
            Sinh_vien sinhVien = new Sinh_vien(1, "Bùi Thị mai", 5, 6, 8);
            oos.writeObject(sinhVien);
            System.out.println("In thành công");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\Java\\untitled\\Vao_ra_du_lieu\\src\\testsv.txt"));
            Sinh_vien sinhVien = (Sinh_vien) ois.readObject();
            System.out.println(sinhVien.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (IOException a) {
            a.printStackTrace();
        }finally {
            ois.close();
        }
    }
}


