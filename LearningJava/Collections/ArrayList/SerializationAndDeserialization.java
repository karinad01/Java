package ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationAndDeserialization {
    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<String>();
        al.add("Sue");
        al.add("Jack");
        al.add("Anna");

        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList)ois.readObject();
            System.out.println(list);

        }catch(Exception e){
            System.out.println(e);

        }
    }
}
