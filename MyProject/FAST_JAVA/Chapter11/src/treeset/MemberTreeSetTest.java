package treeset;

import set.Member;

public class MemberTreeSetTest{
    public static void main(String[] args){
        MemberTreeSet manager = new MemberTreeSet();
        set.Member memberLee = new set.Member(300, "Lee");
        set.Member memberKim = new set.Member(100, "Kim");
        set.Member memberHan = new set.Member(200, "Han");
//        set.Member memberPark = new Member(300, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberHan);
//        manager.addMember(memberPark);

        manager.showAllMember();

    }
}
