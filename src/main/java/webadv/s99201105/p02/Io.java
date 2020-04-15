package webadv.s99201105.p02;

import java.io.*;

public class Io {
    public static final String PATH = "src\\main\\resources\\password.data";

    public User reader(){
        User user = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
            user = (User) ois.readObject();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void writer(User user){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
