package practice;

public class Variables {

    public void intVariables(){
        int salary = 1000;
        System.out.println("My Salary is: " + salary);
    }

    public void floatVariables(){
        float price = 45.6f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables(){
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " Green light is: " + green);
    }

    public void CharacterVariables(){
        char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet);
    }

    public void stringVariables(){
        String name = "Robin" ;
        System.out.println("My name is: " + name + " I live in: " + "Gaithersburg");
    }

    public int AddNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
}
