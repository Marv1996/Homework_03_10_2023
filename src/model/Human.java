package model;

public class Human {
    String name;
    int age;

    public Human(String value) {
        String[] splint = value.split(",");
        name = splint[0];
        age = Integer.parseInt(splint[1]);
    }

    @Override
    public String toString() {
        return "name: " + name + " | age: " + age + "\n";
    }

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
}
