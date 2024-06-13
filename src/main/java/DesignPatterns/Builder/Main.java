package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setAge(10)
                .setPsp(20)
                .setName("priyamvad")
                .setEmail("p@gmail.com")
                .setPno("12345678900")
                .build();
        System.out.println("age:"+st.getAge());
        System.out.println("psp:"+st.getPsp());
        System.out.println("name:"+st.getName());
        System.out.println("email:"+st.getEmail());
        System.out.println("phone:"+st.getPno());
    }
}
