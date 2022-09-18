public class Main {
    public static void main(String[] args) {
        //Задача 1
        int link = 0;
        int clientOc = 0;
        int clientAndroid = 1;
        System.out.println("Установите версию приложения для iOS по ссылке " + clientOc + "");
        //Задача 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear<2015 && link == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке "+clientOc+"");}
        else  if (clientDeviceYear< 2015 && link == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке "+clientAndroid+"");}
        else if (clientDeviceYear >= 2015 && link == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке "+clientOc+"");}
        else  {
            System.out.println("Установите обычную версию приложения для Android по ссылке "+clientAndroid+"");}
        //Задача 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 !=0 || year % 4 == 0 ) {
            System.out.println(year+" год является високосным");}
        else {
            System.out.println(year+" год не является високосным");}

        //Задача 4

        int delivereDistance = 40;
        if (delivereDistance<20) {
            System.out.println("Потребуется один день доставки");}
        else if (delivereDistance>=20 && delivereDistance<60 ) {
            System.out.println("Потребуется двое суток доставки");}
        else if (delivereDistance>=60 && delivereDistance<=100 ) {
            System.out.println("Потребуется трое суток доставки");}

        //Задача 5

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:System.out.println("Январь");
                break;
            case 2:System.out.println("Февраль");
                break;
            case 3:System.out.println("Март");
                break;
            case 4:System.out.println("Апрель");
                break;
            case 5:System.out.println("Май");
                break;
            case 6:System.out.println("Июнь");
                break;
            case 7:System.out.println("Июль");
                break;
            case 8:System.out.println("Август");
                break;
            case 9:System.out.println("Сентябрь");
                break;
            case 10:System.out.println("Октябрь");
                break;
            case 11:System.out.println("Ноябрь");
                break;
            case 12:System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

    }
}