public class Car {
    private String name;
    private int year;
    private int speed;

    void setName (String name){
        this.name =name;
    }
    void setYear (int year){
        this.year = year;
    }
    void setSpeed (int speed){
        this.speed = speed;
    }
    String getName (){
        return name;
    }
    int getYear (){
        return year;
    }
    int getSpeed (){
        return speed;
    }
    void showInfo (){
        System.out.printf("""
                Car
                name: %s
                year: %d
                speed: %d
                ----------------
                """,name,year,speed);
    }
}
