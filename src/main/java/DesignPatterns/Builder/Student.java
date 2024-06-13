package DesignPatterns.Builder;

public class Student {
    private int age;
    private int psp;
    private String name;
    private String email;
    private String pno;

    private Student(Builder bldr){
        this.age = bldr.age;
        this.psp = bldr.psp;
        this.name = bldr.name;
        this.email = bldr.email;
        this.pno = bldr.pno;
    }

    public static Builder getBuilder(){
        return new Builder();
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

    public static class Builder {
        public int age;
        public int psp;
        public String name;
        public String email;
        public String pno;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPno(String pno) {
            this.pno = pno;
            return this;
        }

        public Student build(){
            if(isAgeValid(age) == false){
                throw new IllegalArgumentException("Age should be between 0 and 120");
            }
            if(isPspValid(psp) == false){
                throw new IllegalArgumentException("PSP should be between 0 and 100");
            }
            if(isNameValid(name) == false){
                throw new IllegalArgumentException("Name should not be empty");
            }
            if(isEmailValid(email) == false){
                throw new IllegalArgumentException("Email should not be empty");
            }
            if(isPnoValid(pno) == false){
                throw new IllegalArgumentException("Phone number should not be empty");
            }
            return new Student(this);
        }

        public static boolean isAgeValid(int age){
            if(age < 0 || age > 120){
                return false;
            }
            return true;
        }

        public static boolean isPspValid(int psp){
            if(psp < 0 || psp > 100){
                return false;
            }
            return true;
        }

        public static boolean isNameValid(String name){
            if(name == null || name.length() == 0){
                return false;
            }
            return true;
        }

        public static boolean isEmailValid(String email){
            if(email == null || email.length() == 0){
                return false;
            }
            return true;
        }

        public static boolean isPnoValid(String pno){
            if(pno == null || pno.length() == 0){
                return false;
            }
            return true;
        }
    }
}
