package collection.set;

public class Member {

  private int memberID;
  private String memberName;

  public Member() { }
  public Member(int memberID, String memberName) {
    this.memberID = memberID;
    this.memberName = memberName;
  }

  public int getMemberID() {
    return memberID;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public String toString() {
    return memberName + " 회원님의 아이디는 " + memberID + " 입니다.";
  }

  // 논리적으로 같다를 memberID로 표현
  @Override
  public int hashCode() { // hashCode()와 equals()를 오버라이딩해서 서로 다른 객체라는걸 증명해야한다.
    return memberID;
  }

  @Override
  public boolean equals(Object object) {
    if (object instanceof Member) {
      Member member = (Member) object;
      return (this.memberID == member.memberID);
    }

    return false;
  }

}
