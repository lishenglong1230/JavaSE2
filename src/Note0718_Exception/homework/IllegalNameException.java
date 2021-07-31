package Note0718_Exception.homework;

public class IllegalNameException extends Exception{
    public IllegalNameException(){

    }
    public IllegalNameException(String s){
        super(s);
    }
}
