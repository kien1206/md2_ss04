public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private boolean sex; // true: Nam, false: Nữ
    private String address;

    // Constructor không tham số
    public Student() {
    }

    // Constructor đầy đủ tham số
    public Student(String studentCode, String studentName, int age, boolean sex, String address) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    // Phương thức hiển thị thông tin
    public void showIn4() {
        System.out.println("Mã sv: " + studentCode);
        System.out.println("Tên sv: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " + address);
    }

    // Các phương thức getter và setter (nếu cần)
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}