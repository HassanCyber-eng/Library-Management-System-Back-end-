public class RegularMember extends Member {
    public RegularMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0; // $1 per day
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular Member: " + getName() + " (ID: " + getMemberId() + ")");
    }
}
