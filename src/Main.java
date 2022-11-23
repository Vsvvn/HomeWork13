public class Main {
    public static void main(String[] args) {

        Book dostoevsky = new Book(new Author("Фёдор", "Достоевский"), "Весна", 1955);
        Book frankl = new Book(new Author("Виктор", "Франкл"), "Ювента", 1996);

        dostoevsky.setYear(1956);
        frankl.setYear(1997);

        System.out.println(dostoevsky.getAuthor().getName() + " " + dostoevsky.getAuthor().getSurname() + ". Издание: "
                + dostoevsky.getPublisher() + ". " + dostoevsky.getYearPublishing() + "г.");
        System.out.println(frankl.getAuthor().getName() + " " + frankl.getAuthor().getSurname() + ". Издание: "
                + frankl.getPublisher() + ". " + frankl.getYearPublishing() + "г.");

        System.out.println();

        System.out.println(dostoevsky);
        System.out.println(frankl);

        System.out.println();


        Book unknown = new Book(new Author("Фёдор", "Достоевский"), "Весна", 1955);
        System.out.println(unknown);

        System.out.println();

        System.out.println(dostoevsky.equals(unknown));

        System.out.println();

        System.out.println(dostoevsky.hashCode());
        System.out.println(frankl.hashCode());
        System.out.println(unknown.hashCode());
    }
}