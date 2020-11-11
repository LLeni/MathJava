import java.lang.Math;

public class ClassMath {

    //Необходимые методы                          Их номера
    //abs(float a) ->                             2
    //IEEEremainder(double f1, double f2) ->      19
    //max(float a, float b) ->                    25
    //decrementExact(long a) ->                   15

    public double task_1(double value){
        // №2 Возвращает абсолютное значение (модуль) числа типа float .

        double a = Math.abs(value);
        System.out.println("a " + a);
        // №19 Возвращает остаток от деления f1 на f2.
        double b = Math.IEEEremainder(a, 5);
        System.out.println("b " + b);
        // №25 Возвращает больший из аргументов.
        double c = Math.max(b, -5);
        System.out.println("c " + c);
        // №15 Возвращает значение аргумента уменьшенное на единицу.
        double d = Math.decrementExact((long)c); // (long) -> Явное переопределение типа
        System.out.println("d " + d);
        // Возвращаем итоговое значение
        return d;
    }

    // То же самое, что и task_1, но вызовы не разделены на множество строчек: вызовы методов вложенные
    public double task_2(double value){
        return Math.decrementExact((long)Math.max(Math.IEEEremainder(Math.abs(value),5),-5));
    }
}
