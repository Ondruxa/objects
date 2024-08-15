public class Main {
    public static void main(String[] args) {
        Author name1 = new Author("Максим", "Горький");
        Book number1 = new Book("Детство", name1, 1915);
        Author name2 = new Author("Иван", "Тургенев");
        Book number2 = new Book("Отцы и дети", name2, 1862);

        System.out.println("number1.getTitleOfBook() = " + number1.getTitleOfBook());
        System.out.println("number1.getAuthor().firstName = " + number1.getAuthor().getFirstName());
        System.out.println("number1.getAuthor().lasstName = " + number1.getAuthor().getLastName());
        System.out.println("number1.getPublicationYear() = " + number1.getPublicationYear() + "\n");
        System.out.println("number2.getTitleOfBook() = " + number2.getTitleOfBook());
        System.out.println("number2.getAuthor().firstName = " + number2.getAuthor().getFirstName());
        System.out.println("number2.getAuthor().lasstName = " + number2.getAuthor().getLastName());
        System.out.println("number2.getPublicationYear() = " + number2.getPublicationYear() + "\n");

        number1.setPublicationYear(1916);
        System.out.println("number1.getPublicationYear() = " + number1.getPublicationYear());
    }
}