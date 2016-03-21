package info.liangsheng.pattern.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Created by zhong on 3/21/16.
 */
public class Prototype implements Cloneable, Serializable {
    private String string;

    public Prototype clone() throws  CloneNotSupportedException{
        return (Prototype)super.clone();
    }

    public Prototype deepClone()throws CloneNotSupportedException,IOException, ClassNotFoundException{
        ByteArrayOutputStream baso = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baso);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(baso.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype)ois.readObject();
    }
}


class SerializableObject implements  Serializable{
    private String name;
}
