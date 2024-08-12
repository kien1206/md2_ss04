import java.util.Scanner;

public class Student {
    // Thuộc tính
    private String studentCode;
    private String studentName;
    private int age;
    private boolean sex;
    private double markHTML;
    private double markJavascript;
    private double markJava;

    // Constructor không tham số
    public Student() {
    }

    // Constructor đầy đủ tham số
    public Student(String studentCode, String studentName, int age, boolean sex,
                   double markHTML, double markJavascript, double markJava) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.markHTML = markHTML;
        this.markJavascript = markJavascript;
        this.markJava = markJava;
    }

    // Getter and Setter
    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(double markHTML) {
        this.markHTML = markHTML;
    }

    public double getMarkJavascript() {
        return markJavascript;
    }

    public void setMarkJavascript(double markJavascript) {
        this.markJavascript = markJavascript;
    }

    public double getMarkJava() {
        return markJava;
    }

    public void setMarkJava(double markJava) {
        this.markJava = markJava;
    }

    // Phương thức nhập thông tin sinh viên
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        this.studentCode = scanner.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();

        System.out.print("Nhập giới tính (true = Nam, false = Nữ): ");
        this.sex = scanner.nextBoolean();

        System.out.print("Nhập điểm HTML: ");
        this.markHTML = scanner.nextDouble();

        System.out.print("Nhập điểm Javascript: ");
        this.markJavascript = scanner.nextDouble();

        System.out.print("Nhập điểm Java: ");
        this.markJava = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayData() {
        String sexStr = (this.sex) ? "Nam" : "Nữ";
        System.out.println("Mã sinh viên: " + this.studentCode);
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + sexStr);
        System.out.println("Điểm HTML: " + this.markHTML);
        System.out.println("Điểm Javascript: " + this.markJavascript);
        System.out.println("Điểm Java: " + this.markJava);

        // Tính toán và hiển thị kết quả học tập
        double averageMark = (this.markHTML + this.markJavascript + this.markJava) / 3;
        System.out.print("Kết quả: ");
        if (averageMark > 8) {
            System.out.println("Giỏi");
        } else if (averageMark > 7) {
            System.out.println("Khá");
        } else if (averageMark > 5) {
            System.out.println("Trung Bình");
        } else {
            System.out.println("Trượt");
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng Student và kiểm thử
        Student student = new Student();
        student.inputData();
        student.displayData();
    }
}
