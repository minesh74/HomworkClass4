package encapsulation;

public class TestEncapsulation {
    public static void main(String[] args){
        Encapsulate obj =new Encapsulate();
        //Setting values of the variables
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of the variables
        System.out.println("CodeBuster name:" +obj.getName());
        System.out.println("CodeBuster age:" +obj.getAge());
        System.out.println("CodeBuster rollno:" +obj.getRollNo());

        //Direct access of rollno is not possible due to encapsulation

    }
}
