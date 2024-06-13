package DesignPatterns.Builder;

public class Student {
    private int age;
    private int psp;
    private String name;
    private String email;
    private String pno;

    Student(int age,int psp,String name,String email,String pno){
        //validate age
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("age should be between 0 and 120");
        }
        this.age = age;

        //validate psp
        if(psp < 0 || psp > 100){
            throw new IllegalArgumentException("psp should be between 0 and 100");
        }
        this.psp = psp;

        //validate name
        if(name==null || name.length()==0){
            throw new IllegalArgumentException("name should not be null or empty");
        }
        this.name = name;

        //validate email
        if(email==null || email.length()==0){
            throw new IllegalArgumentException("email should not be null or empty");
        }
        this.email = email;

        //validate pno
        if(pno==null || pno.length()==0 || pno.length()!=10){
            throw new IllegalArgumentException("pno should not be null or empty");
        }
        this.pno = pno;
    }
    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPno() {
        return pno;
    }
}
