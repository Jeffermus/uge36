public class Person implements Comparable<Person>{

    public String name;
    public int height;
    public int age;


    Person(String name, int height, int age) {

        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int compareTo(Person pr) {

        if (this.height == pr.height)
            return 0;

        else if (this.height > pr.height)
            return -1;

        else
            return 1;
    }
}