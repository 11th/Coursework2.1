import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /***
         * Задание 1
         1. Необходимо реализовать следующий метод:
         1. Получаем на входе массив чисел
         2. Все четные числа увеличиваем на единицу
         3. Возвращаем кусок списка с 3-го по 7-й элемент*/
        System.out.println("Task 1");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        try {
            ConvertToOddList(list);
            System.out.println(list);
            System.out.println(getPartOfList(list, 3, 7));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /***
         * Задание 2
         * Дан массив пар названий книг и авторов,
         * необходимо привести каждую пару в строку вида: «Название книги» И. О. Автора.*/
        System.out.println("Task 2");
        Book book1 = new Book("Книга 1", "Иван", "Иванов", "Иванович");
        Book book2 = new Book("Книга 2", "Петр", "Петров", "Петрович");
        Book book3 = new Book("Книга 3", "Николай", "Иванов", "Петрович");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void ConvertToOddList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            var value = list.get(i);
            if (value != 0 && value % 2 == 0) {
                value++;
                list.set(i, value);
            }
        }
    }

    private static List<Integer> getPartOfList(List<Integer> list, int indexFrom, int indexTo){
        if (list.size() == 0) {
            throw new IllegalArgumentException("Список пуст");
        }
        if ((indexFrom > indexTo) || (indexTo > list.size())) {
            throw new IllegalArgumentException("Некорректные индексы елементов");
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = indexFrom; i <= indexTo; i++) {
            resultList.add(list.get(i));
        }
        return resultList;
    }
}