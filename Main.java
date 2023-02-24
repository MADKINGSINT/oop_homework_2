package homeWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    static PersonExample Oleg = new PersonExample();
    static PersonExample Galya = new PersonExample();
    static PersonExample Valera = new PersonExample();
    static PersonExample Vasya = new PersonExample();
    public static void main(String[] args) {
        Oleg.setName("Oleg");
        Galya.setName("Galya");
        Oleg.setRelation("Father");
        Galya.setRelation("Mother");
        Oleg.setGender("Male");
        Galya.setGender("Female");
        Oleg.setRelation("папа");
        Galya.setRelation("бабушка");
        Oleg.setDOB("02.02.1999");
        Galya.setDOB("13.12.1500");
        Oleg.addParent("Galya");
        Oleg.addParent("Vasya");
        Galya.addChild("Oleg");
        Galya.addChild("Valera");
        Valera.addParent("Galya, Vasya");
        print(Valera.getParents());
        SaveFile(Galya, "homeWork2/Galya.txt");
        SaveFile(Oleg, "homeWork2/Oleg.txt");



        print(Oleg.getRelation());
        
        
        Oleg.setDOB("02.02.2000");
        print(Oleg.getDOB());
          
        print(Import.readAllLinesInFile("homeWork2/data.txt"));
        
    }



        public static void SaveFile(PersonExample p, String path){
        
        File file = new File(path);
    try {
        FileWriter writer = new FileWriter(file);
        StringBuilder sb = new StringBuilder()
        .append("Имя: " + p.getName() + "\n")
        .append("Дата рождения" + p.getDOB() + "\n")
        .append("Пол: " + p.getGender() + "\n")
        .append("Родство:" + p.getRelation() + "\n")
        .append("Дети: " + p.getChildren() + "\n")
        .append("Родители: " +p.getParents() + "\n");
        writer.write(sb.toString());
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static void print(Object b){System.out.println(b + "\n");}
    
    
    
       


}