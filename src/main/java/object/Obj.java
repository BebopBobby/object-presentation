package object;

//classes are blueprints for objects

public class Obj {
    private String name;
    public int num;
    // private int num;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
