package homeWork2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    static personExample oleg = new personExample();
    static personExample galya = new personExample();
    static personExample valera = new personExample();
    static personExample vasya = new personExample();

    public static void main(String[] args) {
        oleg.setName("Oleg");
        galya.setName("Galya");

        oleg.setRelation("Father");
        galya.setRelation("Mother");

        oleg.setGender("Male");
        galya.setGender("Female");

        oleg.setRelation("папа");
        galya.setRelation("бабушка");

        oleg.setDOB("02.02.1999");
        galya.setDOB("13.12.1500");

        oleg.addParent("Galya");
        oleg.addParent("Vasya");

        galya.addChild("Oleg");
        galya.addChild("Valera");

        valera.addParent("Galya, Vasya");

        print(valera.getParents());

        saveFile(galya, "homeWork2/Galya.txt");
        

        print(oleg.getRelation());

        oleg.setDOB("02.02.2000");
        print(oleg.getDOB());

        print(importData.readAllLinesInFile("homeWork2/Galya.txt"));

    }

    public static void saveFile(personExample p, String path) {

        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file);
            StringBuilder sb = new StringBuilder()
                    .append(  "Name: " + p.getName() )
                    .append( "Day of birth:" + p.getDOB() )
                    .append( "Gender: " + p.getGender() )
                    .append( "Relation:" + p.getRelation() )
                    .append( "Children:" + p.getChildren() )
                    .append( "Parents: " + p.getParents() );
       
            writer.write(sb.toString());
         
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

        
    public static void print(Object b) {
        System.out.println(b + "\n");
    }

}
