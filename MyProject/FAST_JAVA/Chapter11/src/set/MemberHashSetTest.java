package set;

public class MemberHashSetTest{
    public static void main(String[] args){
        MemberHashSet manager = new MemberHashSet();
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberHan = new Member(300, "Han");
        Member memberPark = new Member(300, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberHan);
        manager.addMember(memberPark);

        manager.showAllMember();

    }
}
