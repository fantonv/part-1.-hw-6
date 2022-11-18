import java.util.Locale;

public class Main {

    public static void printSeparator(){
        System.out.println("++++++++++");
        System.out.println("----------");
    }

//        передача переменной в метод
    public static void printIssues (int issueCount){
        System.out.println(issueCount);
    }
//        метод который считает

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
//  метод первого ЗАДАНИЯ
    public static void calculateYear (int year){
        if (year / 100 != 0 && year / 4 == 0 || year / 400 == 0){
            System.out.println(year + " год является высокосным");
        }else {
            System.out.println(year + " год не явлляется высокосным");
        }
    }

//    метод второго ЗАДАНИЯ

    public static void installRightVersion (int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Устанвоите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Устанвоите версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }
    }

//    метод третьего задания
    public static void calculateDeliveryDays(int deliveryDistance){
        int daysDistance = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней : " + daysDistance);
        }
        daysDistance = daysDistance + 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней : " + daysDistance);
        }
        daysDistance = daysDistance + 1;
        if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней : " + daysDistance);
        }
    }

    public static void main(String[] args) {
//        видеоурок
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);

//      вызов метода решения первого задания

        int year = 1233;
        calculateYear(year);

//      вызов метода решения второго задания
        int clientOS = 0;
        int clientDeviceYear = 2018;
        installRightVersion(clientOS, clientDeviceYear);

//      вызов метода решения тертьяго задания
        int deliveryDistance = 15;
        calculateDeliveryDays(deliveryDistance);

    }
}