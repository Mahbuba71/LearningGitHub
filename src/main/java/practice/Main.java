package practice;

public class Main {
    public static void main ( String[]args){
        Variables VarObj = new Variables();
        VarObj.intVariables();
        VarObj.floatVariables();
        VarObj.booleanVariables();
        VarObj.CharacterVariables();
        VarObj.stringVariables();
        int numbers = VarObj.AddNumbers( 3, 5);
        System.out.println( "Total is: " + numbers);
    }
}
