import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " registered as a member.");
    }

    public void borrowBook(int bookId, int memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && book.isAvailable() && member != null) {
            book.setAvailable(false);
            member.borrowBook();
            loans.add(new Loan(memberId, bookId));
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available or invalid member.");
        }
    }

    public void returnBook(int bookId, int memberId, int overdueDays) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && !book.isAvailable() && member != null) {
            book.setAvailable(true);
            member.returnBook();
            double fine = member.calculateFine(overdueDays);
            System.out.println(member.getName() + " returned " + book.getTitle() + ". Fine: $" + fine);
        } else {
            System.out.println("Book not borrowed or invalid member.");
        }
    }

    private Book findBookById(int bookId) {
        return books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
    }

    private Member findMemberById(int memberId) {
        return members.stream().filter(member -> member.getMemberId() == memberId).findFirst().orElse(null);
    }
}
