import java.util.Scanner;

public class Console{
    private static Scanner scr;
    private static double value;
    public static void main(String[] args) {
        scr = new Scanner(System.in);
        ClassMath classMath = new ClassMath();
        System.out.println("Введите любое вещественное число.");
        while(!scr.hasNextDouble()){
            System.out.println("Ошибка! Вы должны ввести любое вещественное число!");
            scr.next();
        }
        value = scr.nextDouble();
        scr.close();
        System.out.printf("Итоговое значение из task_1: %.5f\n",classMath.task_1(value));
        System.out.printf("Итоговое значение из task_2: %.5f\n", classMath.task_2(value));

    }
}
