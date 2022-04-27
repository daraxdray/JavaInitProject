import java.util.regex.Pattern;

public class MyInputInfo implements Comparable<MyInputInfo>{
    //instantiate the variables
    public String input; //stores the input of users
    public Boolean isNumeric = false;// stores the value type of the user input
    Pattern numericPattern = Pattern.compile("-?\\d+(\\.\\d+)?"); //numeric regular expression pattern


    //our constructor which takes in the user input
    MyInputInfo(String input){
        if(numericPattern.matcher(input).matches()){
            isNumeric = true;
        }
        this.input = input;

    }


    //compares two objects together to sort the list
    @Override
    public int compareTo(MyInputInfo obj) {
        //checks if both input are integers
        if(numericPattern.matcher(this.input).matches() && numericPattern.matcher(obj.input).matches()){
            //compares which of the input has greater value and returns 1
            if(Integer.parseInt(this.input) >  Integer.parseInt(obj.input)){
                return 1;
            }
            //compares if the value is lower then returns -1
            else if(Integer.parseInt(this.input) < Integer.parseInt(obj.input)){
                return -1;
            }else{
                //else it returns 0 to show that the value are thesame
                return 0;
            }
        }
        //executes if the current object is numeric and the second input object is a string
        else if(numericPattern.matcher(this.input).matches() && !numericPattern.matcher(obj.input).matches()){
            return -1;
        }else if(!numericPattern.matcher(this.input).matches() && numericPattern.matcher(obj.input).matches()) {
        return 1;
        }else return Integer.compare(this.input.compareTo(obj.input), 0);
    }


    @Override
    public String toString(){
        //returns Numeric if the input is numeric and other wise when it is a symbol
        return this.isNumeric?"Numeric "+this.input : "Symbol "+this.input;
    }
}


