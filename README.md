# java-basic

Java 학습용 저장소입니다. 인프런 김영한님의 *자바 기본편* 강의를 따라가며 작성한 예제 코드를 챕터별로 정리합니다.

## 환경

- **Java**: JDK 17+
- **IDE**: IntelliJ IDEA
- 빌드 도구 없이 IntelliJ 프로젝트로 직접 실행 (`out/` 디렉토리에 컴파일 결과 생성)

## 실행 방법

IntelliJ에서 프로젝트를 열고 각 `Main` 계열 클래스의 `main` 메서드를 실행합니다.

예시:
```
src/oop1/MusicPlayerMain1.java  →  우클릭 → Run
```

## 디렉토리 구조

```
src/
├── Main.java          # 진입 예제
├── memory/            # 자바 메모리 구조 (스택/힙)
├── class1/            # 클래스와 데이터
├── ref/               # 기본형과 참조형
├── construct/         # 생성자
├── pack/              # 패키지
├── access/            # 접근 제어자
├── static1/, static2/ # static 변수/메서드
├── final1/            # final 키워드
├── oop1/              # 객체 지향 프로그래밍 시작
├── extends1/          # 상속
├── poly/              # 다형성 (오버라이딩, 캐스팅 등)
├── class1/ex,         #  └ 각 챕터의 ex 폴더는 강의 연습 문제
│   poly/ex1~ex6, ...
└── com/               # com.* 패키지 예제
```

각 챕터 폴더는 강의 진도에 맞춰 추가/정리되며, 하위의 `ex`, `ex1`, `ex2`... 폴더에는 해당 단원의 연습 문제 풀이가 들어 있습니다.

## 학습 주제 요약

| 폴더 | 주제 |
|---|---|
| `memory` | 자바 메모리 구조 (스택, 힙, 메서드 영역) |
| `class1` | 클래스, 객체, 인스턴스 |
| `ref` | 기본형 vs 참조형, null |
| `construct` | 생성자, this |
| `pack` | 패키지, import |
| `access` | public / protected / default / private |
| `static1`, `static2` | static 변수, static 메서드, 유틸리티 클래스 |
| `final1` | final 변수, 상수 |
| `oop1` | 객체 지향 입문, 캡슐화 |
| `extends1` | 상속, super |
| `poly` | 다형성, 오버라이딩, 업/다운 캐스팅, instanceof |

## 참고

- 학습 정리용 저장소라 외부 의존성/빌드 설정은 따로 없습니다.
- `out/`, `.idea/`, `*.iml`은 `.gitignore`로 제외되어 있습니다.
