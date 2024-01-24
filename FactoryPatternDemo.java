public interface Shape {
    void draw();
 
}
public class Square implements Shape{
    
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("inside squre draw() method");
    }
    
}

public class Rectangle implements Shape{
    
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("inside rectangle draw() method");
    }
    
}
public  class  ShapeFactory {
    public static Shape ins=null;
    public Shape getShape(String s){
        if(s.equals("squre")){
            ins=new Square();
        }
        else if(s.equals("rectangle")){
            ins=new Rectangle();
        }
        return ins;
    }  
}
public class FactoryPatternDemo {
  
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        shapeFactory.getShape("square");
        shapeFactory.ins.draw();
        shapeFactory.getShape("rectangle");
        shapeFactory.ins.draw();
    }

    
}