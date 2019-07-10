package calc;

import java.util.Arrays;
import java.util.Scanner;

import static calc.inArray.isIn;

public class calcs {

    public static String[]   massDigitArab={"0","1","2","3","4","5","6","7","8","9","10"};
    public static String[]   massOper={"+","-","*","/"};
    public static String[]   StringOper={"Введите первый операнд"," выберите действые *,-,*,/","Введите второй операнд"};
    public static String[]   massDigitRim={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public static int        flagDigitArab=0;
    public static int        flagDigitRim=0;
    public static char       flagOper;
    public static int        result=0;
    public static Integer[]  nums={0,0,0};

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println(StringOper[i]);
            String num = in.next();
            if (isIn(num, massDigitArab)) {
                //System.out.println(Arrays.asList(massDigitArab).indexOf(num) + " входит в массив intArab");
                flagDigitArab++;
                nums[flagDigitArab]=Arrays.asList(massDigitArab).indexOf(num);
            }
            if (isIn(num, massDigitRim)) {
               // System.out.println(Arrays.asList(massDigitRim).indexOf(num) + " входит в массив Rim");
                flagDigitRim++;
                nums[flagDigitRim]=Arrays.asList(massDigitRim).indexOf(num)+1;
            }
            if (isIn(num, massOper)) {
                //System.out.println(Arrays.asList(massOper).indexOf(num) + " входит в массив Oper");
                flagOper=num.charAt(Arrays.asList(massOper).indexOf(num));
            }

        }
        in.close();
        if (((flagDigitArab==2) & (flagDigitRim==0)) || ((flagDigitArab==0) & (flagDigitRim==2)))
            switch (flagOper){
                case '+':
                    result = nums[1]+nums[2];
                    System.out.println(nums[1].toString()+flagOper+nums[2].toString()+"="+result);
                    break;
                case '-':
                    result = nums[1]-nums[2];
                    System.out.println(nums[1].toString()+flagOper+nums[2].toString()+"="+result);
                    break;
                case '*':
                    result = nums[1]*nums[2];
                    System.out.println(nums[1].toString()+flagOper+nums[2].toString()+"="+result);
                    break;
                case '/':
                    result = nums[1]%nums[2];
                    System.out.println(nums[1].toString()+flagOper+nums[2].toString()+"="+result);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");

            } else {
                    System.out.println("Не верно выбрали числа ");
            }

    }

}
