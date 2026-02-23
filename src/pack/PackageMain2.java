package pack;

//import pack.a.User;
import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        //pack.a.User user = new pack.a.User();
        User user = new User(); //import 사용으로 패키지명 생략 가능
        User2 user2 = new User2();
    }
}
