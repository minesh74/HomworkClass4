package encapsulation;
/* private variables declared these can only be
accessed by public methods of class */
public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable name
    public String getName() {
        return name;
    }

    //set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }


    //get method for rollno to access private variable rollno
    public int getRollNo() {
        return rollNo;
    }

    //set Method for rollno to access private variable rollno
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    //get Method for age to access private variable age
    public int getAge() {
       return age;
    }

    //set Method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

}

