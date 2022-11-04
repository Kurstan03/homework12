public class Main {
    public static void main(String[] args) {

        University university = new University();
        university.setName("AUCA");
        university.setAge(2022-1993);
        university.setAddress("Bishkek");

        University university1 = new University();
        university1.setName("Ala-too");
        university1.setAge(2022-1996);
        university1.setAddress("Bishkek");

        University university2 =new University();
        university2.setName("Manas");
        university2.setAge(2022-1995);
        university2.setAddress("Bishkek");


        School school = new School();
        school.setName("Semetei");
        school.setPupils(2300);

        School school1 = new School();
        school1.setName("Kurmanjan Datka");
        school1.setPupils(3000);

        School school2 = new School();
        school2.setName("Aichurok");
        school2.setPupils(1500);

        School school3 = new School();
        school3.setName("Bilimkana");
        school3.setPupils(2000);


        Car car = new Car();
        car.setName("AMG 211");
        car.setYear(1999);
        car.setSpeed(330);

        Car car1 = new Car();
        car1.setName("Porter");
        car1.setYear(1997);
        car1.setSpeed(190);

        Car car2 = new Car();
        car2.setName("Renault");
        car2.setYear(2012);
        car2.setSpeed(230);

        Car car3 = new Car();
        car3.setName("KIA");
        car3.setYear(2021);
        car3.setSpeed(260);


        Person person = new Person();
        person.setName("Samat");
        person.setAge(27);
        person.setGender("m");

        Person person1 = new Person();
        person1.setName("Akylai");
        person1.setAge(31);
        person1.setGender("w");

        Person person2 = new Person();
        person2.setName("Erkin");
        person2.setAge(23);
        person2.setGender("m");

        University[] universities = {university,university1,university2};
        for (University univer : universities) {
                univer.showInfo();
        }
        System.out.println("////////////////////////////////");

        School[] schools = {school,school1,school2,school3};
        for (School sc : schools) {
            sc.showInfo();
        }
        System.out.println("////////////////////////////////");

        Car[] cars = {car,car1,car2,car3};
        for (Car ca : cars) {
            ca.showInfo();
        }
        System.out.println("////////////////////////////////");

        Person[] persons = {person,person1,person2};
        for (Person per : persons) {
            per.showInfo();
        }


    }
}