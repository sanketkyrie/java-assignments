//Implement your  own abstract  classes and  interfaces

interface area{
    void squareArea(int side);
}

abstract class Abs{
    abstract void checkOdd(int n);
}

class Child extends Abs implements area{
    void checkOdd(int n){
        if(n%2 != 0){
            System.out.println("The number "+ n +" is Odd");
        }        
        else{
            System.out.println("The number "+ n +" is not Odd");
        }
    }

    public void squareArea(int side) {
        System.out.println("Area of square is " + side * side);
    }
}

class Q1{
    public static void main(String args[]){
        Child c = new Child();
        c.checkOdd(5);
        c.squareArea(6);
    }
}
