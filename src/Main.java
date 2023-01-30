public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("HW-1");
        String fullName = "Ivanov Ivan Ivanovich";
        String middleName = "Ivanovich";
        String firstName = "Ivan";
        String lastName = "Ivanov";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(" ФИО сотрудника - "
                + fullName + " ");
    }

    public static void task2() {
        System.out.println("HW-2");
        String fullName = "ivanov ivan ivanovich";
        System.out.println(" Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("HW-2");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(" Данные ФИО сотрудника - " + fullName.replace("ё" , "е"));
    }
}