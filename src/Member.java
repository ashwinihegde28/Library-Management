public class Member {

      int memberId;
    String name;
    double fines = 0.0;

    // Constructor with single parameter
    public Member( String name) {
        this.name = name;
    }




    // This overridden method proves string representation of Member object
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", fines=" + fines +
                '}';
    }
}
