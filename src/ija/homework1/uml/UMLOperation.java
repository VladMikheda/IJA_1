package ija.homework1.uml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UMLOperation extends UMLAttribute{
    private List<UMLAttribute> argumentList;

    public UMLOperation(String name, UMLClassifier type){
        super(name,type);
        this.argumentList = new ArrayList<UMLAttribute>();
    }

    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args){
        UMLOperation newOperation = new UMLOperation(name,type);
        for(UMLAttribute arg : args){
            newOperation.addArgument(arg);
        }
        return newOperation;
    }

    public boolean addArgument(UMLAttribute arg){
        if(argumentList.contains(arg)){
           return false;
        }

        argumentList.add(arg);
        return true;
    }

    public List<UMLAttribute> getArguments(){
        return Collections.unmodifiableList(argumentList);
    }
}
