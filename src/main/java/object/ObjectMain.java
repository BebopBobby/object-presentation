package object;

public class ObjectMain {
    public static void main(String[] args) {
        //how to create an object
        //---------------------------------------
        //declare the class in reference
        //give it a name
        //instantiate it

        Obj object1 = new Obj();


        //objects can use methods
        object1.setName("aaaa");
        object1.getName();

        Obj object2 = new Obj();
        object2.setName("bbbb");
        object2.getName();

        //you can make an array of objects

        Obj[] objectArray = {object1, object2};

        //you can call methods on objects in an array

        objectArray[0].getName();
        objectArray[1].getName();

        object1.num = 3;

        //object1.setNum(3);

        //System.out.println(object1.getNum());
    }
}
