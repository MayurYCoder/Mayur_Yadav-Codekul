package encapsulation;

public class Encapsulationdemo {
    private int id;
    private String name;
    private String address;

    public void setId(int id){
    this.id=id;
    }
    public int getId(){
    return id;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        Encapsulationdemo obj= new Encapsulationdemo();
        obj.id=10;
        obj.name="rahul";
        obj.address="Pune";
        System.out.println(obj.getId()+" " + obj.getName()+ " " + obj.getAddress());
    }
}
