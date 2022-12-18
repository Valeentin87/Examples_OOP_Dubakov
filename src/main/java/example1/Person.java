package example1;
//1. Создадим класс Person c заданными полями
//2. Создадим геттеры и сеттеры
//3. Добавим к классу конструктор с параметрами и конструктор по умолчанию
//4. Добавим в класс метод main
//5. Создадим экземпляр класса Person
//6. Создадим статический метод print, выводящий на экран строку, принимаемую аргументом
//7. Продемонстрируем, что экземпляр класса можно создать не только с помощью конструктора,путем присвоения новому
    //экземпляру результата выполнения метода, который вернёт экземпляр
    //7.1 Создадим метод, создающий List<Person>
//8. Наполним List<Person> с помощью вышесозданного метода с указанием одного экземплярра имени Valentin
//9. Переопределим метод toString для класса Person

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//1.
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;

//2.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//3.

    //конструктор с параметрами
    public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }
    //конструктор по умолчанию


    public Person() {
        super();
    }

//6.
    public static void print(String s){
        System.out.println(s);
    }
//7. Метод поиска экземпляра класса в листе текущего класса по имени.Возвращает найденный объект класса Person
    //либо объект класса Person по умолчанию
    public static Person findPerson(List<Person> list, String name){
        for (Person i:list) {
            if (i.getName()==name) return i;
        }
        return new Person();
    }
//7.1
    public static List<Person> createlistPerson(int numberPerson) throws IOException {
        List<Person> listPerson = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<numberPerson;i++){
            System.out.print("Input name: ");
            String name = bf.readLine();
            System.out.print("Input age: ");
            int age = bf.read();
            System.out.print("Input height: ");
            int height = bf.read();
            System.out.print("Input weight: ");
            int weight = bf.read();
            System.out.print("Input eyeColor: ");
            String eyeColor = bf.readLine();
            System.out.print("Input gender: ");
            String gender = bf.readLine();
            listPerson.add(new Person(name,age,height,weight,eyeColor,gender));
        }
        bf.close();
        return listPerson;
    }

//9.


    @Override
    public String toString() {
        return String.format("name: %s, age: %d, height: %s, weight: %d, eyeColor: %s, gender: %s",
                this.name,this.age,this.height,this.weight,this.eyeColor,this.gender);
    }

    //4.
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world Person!");
        Person p = new Person("Valentin",35,62,174,"green","m");
        print(p.getName()+" "+p.getAge()); //обращаем внимание, что возвраст неявно привёлся к типу String
        System.out.println("-----выполнение п.8-------");
        List<Person> newlist = createlistPerson(2);
//7.
        System.out.println("-----------создадим экземпляр класса только на время вывода в консоль с помощью метода " +
                "поиска а не с помощью конструктора");
        Person findPerson = findPerson(newlist,"Valentin");
        System.out.println(findPerson);
    }
}
