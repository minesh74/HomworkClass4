package groupArray;
     /*Write program and add all group members names in to array and iterates
        through for each loop and print your name.*/
public class Array_Group_Name {
    public static void main(String[] args){

        String[] postman = {"Minesh","Jiten","Hetvi","Maulik","Sheetal","Maitri"};
        String[] selenium = {"Kuldip","Umangi","Sonia","Urvi","Parvinder"};
        String[] java     = {"Riddhi","Paresh","Dhwanil","Kunal","Anupama"};
        String[] restassured ={"Arpita","Akshit","Jigar","Shivam","Bhumi"};


        for (String name : postman){
            if (name.equals("Minesh")) {
                System.out.println("Minesh is in Postman Group");
            }
        }
        for (String name : selenium){
            if (name.equals("Minesh")){
                System.out.println("Minesh is in Selenium Group");
            }
        }
        for (String name : java){
            if (name.equals("Minesh")){
                System.out.println("Minesh is in Java Group");
            }
        }
        for (String name : restassured){
            if (name.equals("Minesh")){
                System.out.println("Minesh is in Restassured Group");
            }
        }
    }


}
