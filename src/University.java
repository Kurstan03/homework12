public class University {
    private String name;
    private int age;
    private String address;

    void setName(String name){
        this.name = name;
    }
    void setAge (int age){
        this.age = age;
    }
    void setAddress (String address){
        this.address = address;
    }
    String getName (){
        return name;
    }
    int getAge(){
        return age;
    }
    String getAddress (){
        return address;
    }
    void showInfo (){
        System.out.printf("""
                University
                name: %s
                age: %d
                address: %s
                ---------------------
                """,name,age,address);
    }
}
