package ija.homework1.uml;

import java.util.HashMap;
import java.util.Map;

public class ClassDiagram extends Element{

    private final Map<String, UMLClassifier> classifierList;

    public ClassDiagram(String name) {
        super(name);
        this.classifierList = new HashMap<String, UMLClassifier>();
    }

    public UMLClass createClass(String name){
        if(classifierList.containsKey(name)){
            return null;
        }
        UMLClass newClass = new UMLClass(name);
        classifierList.put(name, newClass);

        return newClass;
    }

    public UMLClassifier classifierForName(String name){
        if(classifierList.containsKey(name)){
            return classifierList.get(name);
        }//todo create UMLClassifier object and assign return object from List and compare

        UMLClassifier newClassifier = UMLClassifier.forName(name);
        classifierList.put(name,newClassifier);
        return newClassifier;
    }

    public UMLClassifier findClassifier(String name){
        return classifierList.get(name);
    }
}
