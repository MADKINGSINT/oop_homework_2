package homeWork2;
import java.util.ArrayList;
import java.util.List;
// Добрый день, спасибо за работу. ДЗ необходимо отправлять ссылкой на github. 
// Модель реализована у вас совсем не в ООП стиле, не надо использовать статические поля в классах моделей человека, отношений. 
// Также необходимо добавить компоненты для работы с деревом - поиск, импорт/экспорт в файл. 
// Не забывайте использовать enum там, где это можно сделать.



abstract class person {
    private String name;
    private String DOB;
    private String gender;
    private String relation;
    private ArrayList<String> parents = new ArrayList<String>();
    
    private List<String> children = new ArrayList<String >();


public String getName() {
        return name;
    }


    public  void setName(String name) {
        this.name = name;
    }


    public String getDOB() {
        return DOB;
    }


    public void setDOB(String dOB) {
        DOB = dOB;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getRelation() {
        return relation;
    }


    public void setRelation(String relation) {
        this.relation = relation;
    }





public person(String name, String DOB, String gender, String relation, ArrayList<String> parents, List<String> children){
    this.name = name;
    this.DOB = DOB;
    this.gender = gender;
    this.relation = relation;
    this.parents = parents;
    this.children = children;
}


public person() {
}


public  List<String> getChildren(){
    return children;
}

public ArrayList<String> getParents(){
    return parents;
}


public  void addParent(String p){
    parents.add(p);
}

public void addChild(String c){
    children.add(c);
}


}







