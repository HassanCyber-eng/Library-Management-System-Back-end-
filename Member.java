public abstract class Member {
    private int memberId;
    private String name;
    private int borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = 0;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook() { borrowedBooks++; }
    public void returnBook() { if (borrowedBooks > 0) borrowedBooks--; }

    public abstract double calculateFine(int overdueDays);
    public abstract void displayInfo();
}
