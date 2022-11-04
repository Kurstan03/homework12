public class School {
    private String name;
    private int pupils;

    void setName(String name){
        this.name = name;
    }
    void setPupils (int pupils){
        this.pupils = pupils;
    }

    String getName (){
        return name;
    }
    int getPupils(){
        return pupils;
    }

    void showInfo (){
        System.out.printf("""
                School
                name: %s
                pupils: %d
                ---------------------
                """,name,pupils);
    }
}
