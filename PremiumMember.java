public class PremiumMember extends Member {
    public PremiumMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.5; // $0.5 per day
    }

    @Override
    public void displayInfo() {
        System.out.println("Premium Member: " + getName() + " (ID: " + getMemberId() + ")");
    }
}
