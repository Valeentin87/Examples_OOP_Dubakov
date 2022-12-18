package typeString;
// ---------------работа с типом стринг в Java--------------------
//1. Обычный типовой вариант объявления строковой переменной
//2. Эквивалентный вариант объявления строковой переменной
// Класс String - класс статический, для неизменяемых строковых переменных
// Если строковую переменную надо динамически изменять используют StringBuilder и StringBuffer
//3. Создание строки на основе массива символов
//4. Создание строки на основе массива байтов
//5. Создание строки на основе части массива байтов
//------------полезные методы класса String-------------------
        /*
        6. int length() - возвращает длину строки (количество символов в ней);
        7. boolean isEmpty() - проверяет, пустая ли строка - возвращает истинну, если строка не содержит символов;
        8. String replace(char oldChar, char newChar) - возвращает строку, в которой все символы, совпадающие
        со значением переменной oldChar, заменяются в новой копии строки на символ newChar;
        9. String toLowerCase() - возвращает строку, в которой все символы исходной строки преобразованы к строчным;
        10. String toUpperCase() - возвращает строку, в которой все символы исходной строки преобразованы к прописным;
        11. boolean equals(String s) - возвращает истинну, если строка к которой применён метод, совпадает со строкой s
        указанной в аргументе метода (с помощью оператора == строки сравнивать нельзя, как и любые другие объекты);
        12. int indexOf(char ch) - возвращает индекс символа ch в строке (индекс это порядковый номер символа,
        но нумероваться символы начинают с нуля). Если символ не будет найден, то возвращается -1.
        Если символ встречается в строке нескольо раз, то вовзвратит индекс его первого вхождения.
        13. int lastIndexOf(char ch) - аналогичен предыдущему методу, но возвращает индекс последнего вхождения,
        если смивол встретился в строке несколько раз.
        14.int indexOf(char ch,int n) - возвращает индекс символа ch в строке, но начинает проверку с индекса n индекс
        это порядковый номер символа, но нумероваться символы начинают с нуля).
        15. char charAt(int n) - возвращает код символа, находящегося в строке под индексом n (индекс это порядковый
        номер символа, но нумероваться символы начинают с нуля).
        16. String substring(int n[,int m]) - возвращает
        подстроку из строки, начиная с начального индекса n до конечного индекса m строки. Можно указать только индекс
        первого символа подстроки - тогда будут скопированы все символы, начиная с указанного и до конца строки. Также
        можно указать и начальный, и конечный индексы - при этом в новую строку будут помещены все символы, начиная с
        первого указанного, и до (но не включая его) символа, заданного конечным индексом.
*/

public class StringExample {

    public static void main(String[] args) {
//1.
        String str1 = "Hello";
//2.
        String str2 = new String("Hello!!!");
        System.out.println(str1 + " " + str2);
//3.
        char[] chars = {'a', 'b', 'c' };
        String str3 = new String(chars);
        System.out.println(str3);
//4.
        byte[] bytes = {65, 32, 44, 92, 87};
        String str4 = new String(bytes);
        System.out.println("На основе массива байтов строка: " + str4);
//5.
        String str5 = new String(bytes, 0, 2);
        System.out.println("На основе части массива байтов: " + str5);
//6.
        String str6 = "Hello good girl!!!";
        int i = str6.length();
        System.out.println("6.Длина строки равна " + i);
//7.
        String str7 = "";
        System.out.println("7. Пустая строка str7:" + str7.isEmpty() + " строка str6 не пустая: " + str6.isEmpty());

//8.
        String str8 = "Hello";
        System.out.println("8. поменяли букву L на z "+str8.replace('l','z'));
//9.
        System.out.println("9.В верхний регистр: "+str8.toUpperCase());
        System.out.println("10.В нижний регистр: "+str8.toLowerCase());
//11.
        String str9 = "Hello";
        System.out.println("11. Строки 'Hello' и 'Hello' одинаковые: "+str8.equals(str9));
//12.
        System.out.println(str9.indexOf('e')+" это индекс первого вхождения");
        System.out.println(str9.indexOf('z')+" не встречается");
//13.
        System.out.println("13. Индекс последнего вхождения 'l': "+str9.lastIndexOf('l'));
//14.
        System.out.println("14. Индекс вхождения символа, начиная с определенного игдекса: "+str8.indexOf('l',1));
//15.
        System.out.println("15. Код 2 символа: "+str8.charAt(2));
//16.
        System.out.println("Подстрока: "+str6.substring(3,7));
    }



}
