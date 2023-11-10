public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("89176977133","iPhone",0.3);
        Phone p2 = new Phone("89176978777","SAMSUNG",  0.4);
        Phone p3 = new Phone("89183377133","Honor",0.5);


        System.out.println("Телефон 1:");
        System.out.println("Номер: " + p1.getNumber());
        System.out.println("Модель: " + p1.getModel());
        System.out.println("Вес: " + p1.getWeight());

        System.out.println();

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + p2.getNumber());
        System.out.println("Модель: " + p2.getModel());
        System.out.println("Вес: " + p2.getWeight());

        System.out.println();

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + p3.getNumber());
        System.out.println("Модель: " + p3.getModel());
        System.out.println("Вес: " + p3.getWeight());

        System.out.println();
        p2.receiveCall("Bobik Grobik");
        System.out.println();
        p1.receiveCall("Alexander Shishlonovh", p1.getNumber());
        System.out.println();
        p3.sendMessage("89739388133", "891342133", "8949340129");

        System.out.println();
        System.out.println("Задание: Читатели Библиотеки");
        System.out.println();

        Reader reader1 = new Reader("Сидоров Илья Иванович", "123-312", "Факультет физической культуры", "19.01.2004", "89176977133");
        Reader reader2 = new Reader("Бобиков Петр Голикович", "123-431", "Факультет математики и информатики", "18.05.2004", "891712977133");

        Book book1 = new Book("Приключения", "Тургенев");
        Book book2 = new Book("Словарь", "Даль");
        Book book3 = new Book("Энциклопедия", "Аристотель");
        Book book4 = new Book("Игрок", "Толстой");
        Book book5 = new Book("Лиса ворна и сыр вроде", "Крылов");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        System.out.println();

        reader2.returnBook(2);
        reader2.returnBook("Книга1", "Книга2");
        reader2.returnBook(book4, book5);
    }
}