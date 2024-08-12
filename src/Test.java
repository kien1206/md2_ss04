public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng student thông qua class Student
        Student student = new Student();
        student.getAge(20);
        student.setStudentName();
        // Gọi phương thức để nhập thông tin
        student.inputData();

        // Gọi phương thức để hiển thị thông tin
        student.displayData();

        // Phương thức displayData đã hiển thị kết quả học tập (xét tốt nghiệp)
        // nên không cần gọi thêm phương thức khác.
    }
}