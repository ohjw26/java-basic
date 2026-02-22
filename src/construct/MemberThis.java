package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //멤버 변수와 매개변수의 이름이 서로 다르므로 this가 없어도 멤버 변수에 접근한다
    }
}
