public class Program {
    public static void main(String[] args) {
        // Khởi tạo object1 thông qua constructor không tham số
        Student object1 = new Student();
        object1.setStudentCode("SV001");
        object1.setStudentName("Nguyễn Văn A");
        object1.setAge(20);
        object1.setSex(true);
        object1.setAddress("Hà Nội");
        object1.showIn4();

        // Khởi tạo object2 thông qua constructor đầy đủ tham số
        Student object2 = new Student("SV002", "Nguyễn Văn B", 21, false, "Đà Nẵng");
        object2.showIn4();
    }
}