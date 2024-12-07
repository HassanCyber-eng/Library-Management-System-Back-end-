public class FictionBook extends Book {
    private String genre;

    public FictionBook(int id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + " (Genre: " + genre + ")");
    }
}
