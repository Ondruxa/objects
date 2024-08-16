public class Main {
    public static void main(String[] args) {
        Author name1 = new Author("Максим", "Горький");
        Book number1 = new Book("Детство", name1, 1915);
        Author name2 = new Author("Иван", "Тургенев");
        Book number2 = new Book("Отцы и дети", name2, 1862);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number2.equals(number1));
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());
    }
}