import java.util.Scanner;
import java.util.Calendar;

public class Main {


    public static boolean chekingTheYear(int rangeEnterYear) { // проверка диапозона
        boolean flag;
        Calendar cal = Calendar.getInstance();
        if (rangeEnterYear >= 1582 && rangeEnterYear <= cal.get(Calendar.YEAR)) {
            return flag = true;
        } else {
            return flag = false;
        }
    }

    public static void leapCheckingTheYear(int i) { // проверка, является ли год високосным
        if (i % 100 == 0) {
            System.out.println("Не високосный");
        } else if (i % 400 == 0 || i % 4 == 0) {
            System.out.println(i + "   " + "Високосный");
        } else System.out.println("Не високосный");

    }

    public static boolean chekingTheYearPhone(int rangeEnterYearPhone) {
        boolean flag;
        Calendar cal = Calendar.getInstance();
        if (rangeEnterYearPhone >= 2015 && rangeEnterYearPhone <= cal.get(Calendar.YEAR)) {
            return flag = true;
        } else {
            return flag = false;
        }
    }

    public static void chekingOsPhone(int typeOS) {
        if (typeOS == 0)
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        else if (typeOS == 1) System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static int chekingRange (int dis)
    {
        if (dis<=20)
             {
            System.out.println("Доставка занимает 1 сутки");
              }
            else
                 if (dis <=60)
                     {
                   System.out.println("Доставка занимает 2 суток");
                    }
             else
                  System.out.println("Доставка занимает 3 суток");
                  return  dis;
    }
    //-----------------------------------main---------------------------------------

    public static void main(String[] args) {
        System.out.println("Введите год для определения високосный он или нет");
        Scanner in = new Scanner(System.in);
        int enterYear = in.nextInt();

        if (chekingTheYear(enterYear)) {
            System.out.println("Ввели правельно");
            leapCheckingTheYear(enterYear);
        } else {
            System.out.println(" Введите коректный год от 1582 до настоящего времени");
        }
        System.out.println("________________________________");

//----------------------------------

        System.out.println("Введите год производства телефона...");
        Scanner inPhone = new Scanner(System.in);
        int enterYearPhone = inPhone.nextInt();

        if (chekingTheYearPhone(enterYearPhone) == false) {
            System.out.println("Какая операционная система телефона ?");
            System.out.println("0- IOS,   1 - Android");
            Scanner OS = new Scanner(System.in);
            int OsPhone = OS.nextInt();
            chekingOsPhone(OsPhone);
        } else {
            System.out.println("Установите обычную версию приложения");
        }

        //---------------------------------------------------------------------
        System.out.println("Введите расстояние от нашего офиса до адреса доставки");
        Scanner Distance = new Scanner(System.in);
        int EnterDistance = Distance.nextInt();
        chekingRange (EnterDistance);
    }
}
