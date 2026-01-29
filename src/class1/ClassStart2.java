package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}

// 배열 사용의 한계가 있음 -> 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높음
//ㅇㄹㅇ나러ㅣ마ㅓ이ㅏ러ㅣ아ㅓ리ㅏㄴㅁ어리ㅏ ㅓㅣㅏ얼 ㅣ니ㅑㄷ러ㅣ야머디ㅑ러니ㅏㅇㄹ