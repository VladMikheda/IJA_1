package ija.homework1.uml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UMLClass extends UMLClassifier{

    private boolean isAbstract;
    private List<UMLAttribute> attributesList;

    public UMLClass(String name){
        super(name);
        attributesList = new ArrayList<UMLAttribute>();
    }

    public boolean isAbstract(){
        return isAbstract;
    }

    public void setAbstract(boolean isAbstract){
        this.isAbstract = isAbstract;
    }

    public boolean addAttribute(UMLAttribute attr){
        if(attributesList.contains(attr)){
            return false;
        }

        attributesList.add(attr);
        return true;
    }

    public int getAttrPosition(UMLAttribute attr){
        return attributesList.indexOf(attr);
    }

    public int moveAttrAtPosition(UMLAttribute attr, int pos){
        if(pos < 0 ){
            return -1;
        }

        if(!attributesList.contains(attr)){
            return -1;
        }
        attributesList.remove(attributesList.indexOf(attr));
        for(int i = attributesList.size() - 1; i >= pos; i--){
            UMLAttribute el = attributesList.get(i);
            attributesList.add(i+1, el);
        }

        attributesList.set(pos,attr);

        return pos;


    }


    public List<UMLAttribute> getAttributes(){
        return Collections.unmodifiableList(attributesList);
    }



}
