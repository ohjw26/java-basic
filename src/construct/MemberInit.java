package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 기본 생성자
    // 클래스에 생성자가 하나도 없으면 자바 컴파일러는 기본 생성자를 자동으로 만들어준다
/*    MemberInit() {
    }*/

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; //멤버변수에 접근하기 위해 this.를 입력 (인스턴스 자신의 참조값을 가리킴)
        this.age = age;
        this.grade = grade;
    }
}
