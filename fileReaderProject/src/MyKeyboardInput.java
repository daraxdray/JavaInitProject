import java.util.*;
import java.util.regex.Pattern;

public class MyKeyboardInput {


    public static void main(String[] args) {
        //System.in provides keyboard input through console
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");// creates a pattern to match numerics
        System.out.println("Input Key");

        String userInput = scanner.nextLine();

        //split the string into array
        String[] splitted = userInput.split(" ");


        //1c
        Set<Object> stringSet = new HashSet<>();
        //loop through the splitted strings to add their corresponding integer or string
        for(String split : splitted){
            //adds the value as integer if it matches and string if it does not
            if(pattern.matcher(split).matches()){
                stringSet.add(Integer.parseInt(split));
            }else {
                stringSet.add(split);
            }
        }

        //1D
        Map<MyInputInfo,Integer> treeMap = new TreeMap<>();
//loops through the splitted string and creates object
        for(String split : splitted){
            MyInputInfo info = new MyInputInfo(split);
            //increment the if it already exists
            if(treeMap.containsKey(info)){
                treeMap.put(info,treeMap.get(info)+1);
                continue;
            }
            //puts the object - MyInputInfo and integer
                treeMap.put(info,1);
        }


        System.out.println(treeMap);
        System.out.println(stringSet);
    }
}
