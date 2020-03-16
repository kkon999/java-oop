package org.opentutorials.javatutorials.constant2;

enum Fruit5{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit5(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
 
enum Company5{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo5 {
     
    public static void main(String[] args) {
        Fruit5 type = Fruit5.APPLE;
        switch(type){
            case APPLE:
                System.out.println(70+" kcal, "+Fruit5.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(100+" kcal"+Fruit5.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(110+" kcal"+Fruit5.BANANA.getColor());
                break;
        }
    }
}