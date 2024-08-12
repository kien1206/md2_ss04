public class PersonProgram {
    public static void main(String[] args) {
        Person person1 = new Person();
        // gián trị cho đối tượng person
        person1.setName("Ngọc Mai");
        person1.setAge(19);
        person1.setSex(false);

        Person person2 = new Person("Lâm",true,27);
        // truy cập lấy tên của đối tượng person
        System.out.println("Tên là "+ person2.getName());
        System.out.println("Giới tính là "+(person2.isSex() ? "Nam":"Nữ"));
    }
}