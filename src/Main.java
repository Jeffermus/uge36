import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;

public class Main{

    public static void main(String[] args){

        int count = 0;


        try {
            File myObj = new File("Resources/File.txt");
            Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            count++;
            System.out.println(count);
            System.out.println(data);

        }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something went Wrong ERROR");
            e.printStackTrace();
        }

        ArrayList<Person> array = new ArrayList<Person>();
        array.add(new Person("Tobias",210,29));
        array.add(new Person("Andreas",194,29));
        array.add(new Person("Abdulahi",169,22));
        array.add(new Person("Jeffrey",201,25));


        Collections.sort(array);
        for(Person pr:array){
            System.out.println(pr.name + " " + pr.height + "cm høj " + pr.age + " år " );
        }
    }


    }
