import java.util.PrimitiveIterator;

public class Person {

        private String name;
        private int age;
        private static final int MIN_AGE = 20;
        private static final int MAX_AGE = 40;
        private int phone_number ;
        private String birth_date;
        private String email ;

        public static boolean isAgeValid(int age ){
            return age >=MIN_AGE && age <= MAX_AGE;
        }
        public static String getAgeChecker( int age ) {
            if (isAgeValid(age)) {
                return " the age "+ age + "is permitted. ";
            }else {
                return "the age " + age + "is not permitted.";
            }
        }
        public  void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }



    public Person (String name , int age , int phone_number, String birth_date , String email){
            this.name = name;
            this.age = age ;
            this.phone_number = phone_number;
            this.email = email;
            this.birth_date = birth_date;


    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone_number=" + phone_number +
                ", birth_date='" + birth_date + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
