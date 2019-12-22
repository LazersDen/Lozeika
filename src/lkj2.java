import java.util.Scanner;

public class lkj2 {public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Доступные переводы мер длины \n 1-Из сажаней в Метры \n 2-Из Дюймов в сантиметры \n 3-Из Фунтов в меры \n 4-Из Драхм в граммы \n 5-Из Унций в граммы \n6-Из Фунтов в килограмы\n7-Из Аршин в метры\n 8-Из Золотников в грамы\n9-Из Дюймов в милиметры");
    System.out.println("Ведите число ");
    int q=in.nextInt();
    System.out.println("Выберите функцию");
    int e=in.nextInt();
    switch (e){
    case 1:
       float w = (float) 2.1366;System.out.println(q+"Сажаней ="+"Метров "+q*w);break;
    case 2:
        float r =(float)2.5; System.out.println(q+"Дюймов  ="+"Сантиметры"+q*r);break;
    case 3:
        float t = (float) 0.3048; System.out.println(q+"Фунтов  ="+"Метров"+q*t);break;
    case 4:
        float y = (float)3.7325 ;System.out.println(q+"Драхм ="+"Грамм"+q*y);break;
    case 5:
        float u = (float)29.86 ; System.out.println(q+" Унций ="+"Грамм"+q*u);break;
    case 6:
        float i = (float)0.40951 ;System.out.println(q+"Фунтов ="+"Килограмы"+q*i);break;
    case 7:
        float o = (float)0.7112 ;System.out.println(q+"Аршин ="+"Метры"+q*o);break;
    case 8:
        float p = (float)4.2657 ;System.out.println(q+"Золотников ="+"Грамм"+q*p);break;
    case 9:
        float a = (float)25.3995 ;System.out.println(q+"Дюймов ="+"Милиметры"+q*a);break;
}
}}
