public class Person {
    private String name;
    private int age;
    private String gender;

    void setName(String name){
        this.name = name;
    }
    void setAge (int age){
        this.age = age;
    }
    void setGender (String gender){
        this.gender = gender;
    }
    String getName (){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
    void showInfo (){
        System.out.printf("""
                Person
                name: %s
                age: %d
                gender: %s
                ---------------------
                """,name,age,gender);
    }
}
