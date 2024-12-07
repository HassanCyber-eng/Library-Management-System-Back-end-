public class Loan {
    private int memberId;
    private int bookId;

    public Loan(int memberId, int bookId) {
        this.memberId = memberId;
        this.bookId = bookId;
    }

    public int getMemberId() { return memberId; }
    public int getBookId() { return bookId; }
}
