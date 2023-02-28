package homeWork2;

import java.util.ArrayList;
import java.util.List;

abstract class person {
    private String name;
    private String DOB;
    private String gender;
    private String relation;
    private ArrayList<String> parents = new ArrayList<String>();

    private List<String> children = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public person(String name, String DOB, String gender, String relation, ArrayList<String> parents,
            List<String> children) {
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.relation = relation;
        this.parents = parents;
        this.children = children;
    }

    public person() {
    }

    public List<String> getChildren() {
        return children;
    }

    public ArrayList<String> getParents() {
        return parents;
    }

    public void addParent(String p) {
        parents.add(p);
    }

    public void addChild(String c) {
        children.add(c);
    }

}
