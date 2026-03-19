package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        System.out.println("");

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스의 경우 childMethod() 실행
        if(parent instanceof Child child) { //java16 부터는 instanceof를 사용하면서 동시에 변수를 선언할 수 있음.
            System.out.println("Child 인스턴스 맞음");
            //Child child = (Child) parent;
            child.childMethod();
        }
    }
    //instanceof를 사용해서 원하는 타입으로 변경이 가능한지 확인한 후 다운캐스팅을 사용하는 것이 안전함.
}
