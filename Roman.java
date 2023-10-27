import java.util.HashMap;
import java.util.Scanner;

public class Roman {

    public static int romanToInt(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);       
       
        int result =0;
        int prevValue = 0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char num = s.charAt(i);
            int value = map.get(num);

            if(value < prevValue)
            {
                result -= value;

            }else{
                result+= value;
            }
            prevValue = value;
        }
          return result;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number:");
        String result = sc.next();
        sc.close();

        int integerval = romanToInt(result);
        System.out.println("The Roman numeral "+ result + " is equivalent to the integer " + integerval);
     }
}
