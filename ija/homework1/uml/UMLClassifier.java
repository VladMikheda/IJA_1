package ija.homework1.uml;

public class UMLClassifier extends Element{

    private boolean isUserDefined;
    public UMLClassifier(String name) {
        super(name);
        this.isUserDefined = true;
    }
    public UMLClassifier(String name, boolean isUserDefined){
        super(name);
        this.isUserDefined = isUserDefined;
    }

    public static UMLClassifier forName(String name){
        UMLClassifier newClassifier = new UMLClassifier(name, false);
        return newClassifier;
    }

    public boolean isUserDefined(){
        return this.isUserDefined;
    }

    public String toString(){
        return name + "(" + this.isUserDefined + ")";
    }

//    protected boolean userDefined;
//    protected String className;
//
//    public static UMLClassifier forName(String name){
//        UMLClassifier classifier = new UMLClassifier();
//        classifier.className = name;
//        classifier.userDefined = false;
//        return classifier;
//    }
//
//
//    public boolean isUserDefined(){
//        return this.userDefined;
//    }
}
