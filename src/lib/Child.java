package lib;

public class Child {
    private String childIdNumbers;
    private String childNames;

    public Child(String childIdNumbers, String childNames) {
        this.childIdNumbers = childIdNumbers;
        this.childNames = childNames;
    }

    public String getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(String childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }

    public String getChildNames() {
        return childNames;
    }
    
    public void setChildNames(String childNames) {
        this.childNames = childNames;
    }
}
