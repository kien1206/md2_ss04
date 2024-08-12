public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng student thông qua lớp Student
        Student student = new Student();

        // Gán giá trị cho các thuộc tính của đối tượng student
        student.setStudentCode("SV003");
        student.setStudentName("Nguyễn Văn C");
        student.setAge(22);
        student.setSex(true);
        student.setAddress("Hồ Chí Minh");

        // Gọi phương thức hiển thị thông tin
        student.showIn4();
    }
}