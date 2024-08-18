public class Member {

      int memberId;
    String name;
    double fines = 0.0;

    public Member( String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", fines=" + fines +
                '}';
    }
}
