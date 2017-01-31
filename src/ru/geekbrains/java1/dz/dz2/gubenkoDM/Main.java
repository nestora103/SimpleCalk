package ru.geekbrains.java1.dz.dz2.gubenkoDM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nestor on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Пункт 1
        System.out.println("Пункт 1");
        int[] arr={1,0,1,0,0,1,1,1,1,1,1,0,0,0};
        System.out.println(Arrays.toString(arr));


        //Пункт 2
        System.out.println("Пункт 2");
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        };
        System.out.println(Arrays.toString(arr));


        //Пункт 3
        System.out.println("Пункт 3");
        int[] arrI=new int[8];
        int i=0;
        while (i<arrI.length){
            switch (i){
                case 0:
                    arrI[i]=1;
                    break;
                case 1:
                    arrI[i]=4;
                    break;
                case 2:
                    arrI[i]=7;
                    break;
                case 3:
                    arrI[i]=10;
                    break;
                case 4:
                    arrI[i]=13;
                    break;
                case 5:
                    arrI[i]=16;
                    break;
                case 6:
                    arrI[i]=19;
                    break;
                default:
                    arrI[i]=22;
                    break;
            }
            i++;
        };
        System.out.println(Arrays.toString(arrI));

        //Пункт 4
        System.out.println("Пункт 4");
        int[] mas={1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(mas));

        for(int j=0;j<mas.length;j++){
            if (mas[j]<6){
                mas[j]*=2;
            };
        }
        System.out.println(Arrays.toString(mas));

        //Пункт 5
        System.out.println("Пункт 5");
        Random rand=new Random();
        long[] randArr=new long[50];
        for(int j=0;j<randArr.length;j++){
            randArr[j]=rand.nextInt(51);
        }
        System.out.println(Arrays.toString(randArr));
        //отсортируем массив по возрастанию
        Arrays.sort(randArr);
        System.out.println(Arrays.toString(randArr));

        System.out.println("Минимум:"+randArr[0]);
        System.out.println("Мaксимум:"+randArr[randArr.length-1]);
        //Пункт 6
        System.out.println("Пункт 6");
        //создаем объект сканера для осуществления пользовательского ввода из консоли
        Scanner sc=new Scanner(System.in);
        System.out.println("Вас приветствует калькулятор!");
        System.out.println("Введите первое число");
        double a=sc.nextInt();
        System.out.println("Введите второе число");
        double b=sc.nextInt();
        System.out.println("Введите операцию между введенными ранее числами");
        System.out.println("Разрешенные операции:+,-,*,/,%");
        String op=sc.next();
        double result;
        switch (op){
            case "+":
                result=sum(a,b);
                break;
            case "-":
                result=minus(a,b);
                break;
            case "*":
                result=multiply(a,b);
                break;
            case "/":
                result=division(a,b);
                break;
            case "%":
                result=mod(a,b);
                break;
            default:
                result=-1;

        }

        if (result==-1){
            System.out.println("Введена не допустимая операция!");
        }else{
            System.out.println("a="+a+" b="+b+" "+a+op+b+"="+result);
        }

        //двумерный массив
        //двумерный массив это массив одномерных массивов. первый индекс номер строки. второй индекс номер элемента в массиве.
        //вся нумерация с 0
        int[][] dArr=new int[5][5];
        dArr[0][0]=0;
        dArr[0][1]=1;
        dArr[0][2]=2;
        dArr[0][3]=3;
        dArr[0][4]=4;
        dArr[1][0]=5;
        dArr[1][1]=6;
        dArr[1][2]=7;
        dArr[1][3]=6;
        dArr[1][4]=6;
        System.out.println(Arrays.deepToString(dArr));

    };






    private static double sum(double a,double b){
        return a+b;
    };

    private static double minus(double a,double b){
        return a-b;
    };

    private static double multiply(double a,double b){
        return a*b;
    };

    private static double division(double a,double b){
        if (b!=0){
            return a/b;
        };
        return 0;

    };
    private static double mod(double a,double b){
        if (b!=0){
            return a%b;
        };
        return 0;
    }



}
