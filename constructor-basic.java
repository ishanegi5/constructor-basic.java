class Cylinder{
    int radius;
    int height;
    public int getr(){
        return radius;
    }
    public int geth(){
        return height;
    }
   
    public Cylinder(int r,int h){
        radius=r;
        height=h;
    }
   
}



public class Main{
    public static void main(String[]args){
        Cylinder cn=new Cylinder(5,9);
        System.out.println(cn.getr());
        System.out.println(cn.geth());
    }
}
