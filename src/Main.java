public class Main {
    public static void main(String[] args) {
//Задание 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задание 2
        //0 - iOS; 1 - Android
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию для iOS по ссылке");
        if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android");
        }

//Задание 3

// Высокостным год является каждый четвертый год, но не является  каждый сотый. также высокостным является каждый четырех=сотый год.
        var year = 2020;
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("Год является високостным");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("Год является високостным");
        else if (year % 100 == 0)
            System.out.println("Год не является високостным");
        else
            System.out.println("Год не является високостным");

//Задание 4
        int deliveryDistance = 30;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            if (deliveryDistance <= 60 && deliveryDistance >= 20) {
                System.out.println("Потребуется дней " + (deliveryTime + 1));
            } else {
                if (deliveryDistance >= 60 && deliveryDistance <= 100)
                    System.out.println("Потребуется дней " + (deliveryTime + 2));
            }
        }

//Задание 5
        int monthNumber = 7;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}