package lib;

import java.util.LinkedList;
import java.util.List;

public class PersonalInfo {
    private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

    private boolean isForeigner;
	private Gender gender;

    private Spouse spouse;
	private List<Child> child;

    public PersonalInfo(String firstName, String lastName, String idNumber, String address, boolean isForeigner, Gender gender, Spouse spouse){
        this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
        this.isForeigner = isForeigner;
		this.gender = gender;
        this.child = new LinkedList<Child>();
    }

    public String getFirstName() {
        return firstName;
    }   

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public void setForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public void addChild(String childName, String childIdNumber) {
		child.add(new Child(childIdNumber, childName));
	}

    public List<Child> getChild() {
        return child;
    }
}
