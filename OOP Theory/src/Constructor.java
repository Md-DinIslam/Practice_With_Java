import javax.naming.Name;
public class Constructor {
    String Name;
    int ID;
    Constructor(){
        Name = "DinIslam";
        ID = 221002475;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setID(int id){
        this.ID = id;
    }
    public int getID(){
        return ID;
    }
}
