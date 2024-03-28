
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aslan", "Safarov", "2006.06.06");
        Car car = new Car("Mercedes", 2005, 5.5);
        Book book = new Book("Song on Ice and Fire","Stiv djobs",2006);
        person.PersPrint();
        person.Trio(car,book);
        car.CarPrint();
        book.BookPrint();
    }
}

class Person{
    String name;
    String s_name;
    String birth_day;
    public Person(String name, String s_name, String birth_day){
        this.name = name;
        this.s_name =  s_name;
        this.birth_day = birth_day;
    }

    public void PersPrint(){
        System.out.println("Имя:" + name);
        System.out.println("Фамилия:" + s_name);
        System.out.println("Год рождения:" + birth_day);
    }

    public void Trio(Car car, Book book){
        System.out.println(name + " читает книгу " + book.name + " про машину " + car.marks);
    }
}

class Car{
    String marks;
    int years;
    double engine;

    public Car(String marks, int years, double engine){
        this.marks = marks;
        this.years = years;
        this.engine = engine;
    }

    public void CarPrint(){
        System.out.println("Марка автомобиля:" + marks);
        System.out.println("Год выпуска:" + years);
        System.out.println("Объем двигателя:" + engine);
    }
}

class Book{
    String name;
    String autor;
    int year;
    public Book(String name,  String autor, int year){
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public void BookPrint(){
        System.out.println("Название книги:" + name);
        System.out.println("Автор:" + autor);
        System.out.println("Год выпуска:" + year);
    }
}
