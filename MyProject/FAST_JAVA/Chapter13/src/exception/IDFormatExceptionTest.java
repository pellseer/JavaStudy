package exception;

public class IDFormatExceptionTest {

    private String userID;

    public static void main(String[] args){
        IDFormatExceptionTest idTest = new IDFormatExceptionTest();
        String myId = null;
        try {
            idTest.setUserID(myId);
        } catch (IDFormatException e) {
            System.out.println(e);
        }

        myId = "123456";
        try {
            idTest.setUserID(myId);
        } catch (IDFormatException e) {
            System.out.println(e);
        }
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null){
            throw new IDFormatException("아이디는 null 일 수 없습니다.");
        }
        else if(userID.length() < 8 || userID.length() > 20){
            throw new IDFormatException("아이디는 8자이상 20자 이하로 사용하세요");
        }
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }
}
