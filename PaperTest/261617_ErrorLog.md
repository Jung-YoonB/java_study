- 작성자 : 배 정 윤
- 제출일 : 2026 - 06 - 18

---

## 문제 번호 : 3

### 문제 내용

<aside>

:q: 다음 중 자바의 변수 명명 규칙으로 올바르지 않은 것을 모두 고르시오.

① int 1stNumber;

② int _value;

③ int totalSum;

④ int class;

</aside>

- 작성한 답안 : ① , ②
- 실제 답안 : ①, ④

### 관련 개념 정리

#### 변수 명명 규칙

- **필수 식별자 규칙 中 위반 시 문법 에러가 나는 명명**
    - 숫자로 시작
    
    - 자바의 예약어
        - public, if, for, int, class 등
    
    - 공백(띄어쓰기)
    
- **작성은 가능 하나 관례상 제한적인 명명**
    - 대소문자 구분
        - 소문자로 시작, 공백 대신 두번째 단어의 첫글자를 대문자로 표현
         ⇒ 낙타 표기법(camelCase)
        - final을 사용한 상수 명명 시엔 모든 글자를 대문자로 표현
    
    - 특수 문자 中 밑줄( _ ) 과 달러 표시( $ )는 사용 가능
        - 단, 관례상 밑줄( _ ) 은 상수 final 명명할 때 공백 대신 사용

#### 오답 노트

<aside>

:q: 다음 중 자바의 변수 명명 규칙으로 올바르지 않은 것을 모두 고르시오.

**① int 1stNumber;**     //  **숫자로 시작**하므로 **문법 에러**남! 절대 안됨!

② int _value;               //  사용은 가능함. 그냥 관례상 별로다.

③ int totalSum;         //  문제 없음!

**④ int class;**                //  **calss** 는 **자바 예약어**! **문법 에러**! 얘도 안됨!

</aside>

---

## 문제 번호 : 7

### 문제 내용

<aside>

:q: 다음 코드가 실행되었을 때 변수 y의 최종 출력값으로 올바른 것을 고르시오.

```java
int x = 5;
int y = 10;
boolean result = (x > 5) && (++y > 10);

System.out.println(y);
```

① 10

② 11

③ 0

④ 컴파일 에러 발생

</aside>

- 작성한 답안 : ②
- 실제 답안 : ①

### 관련 개념 정리

#### 논리 연산자의 단축 평가 (Short-Circuit Evaluation, SCE)

- **&&** (AND)
    - **두 조건이 모두** **true** 일 때만 **true** 반환
        - **true && true** == **true**
        - **true** **&&**  **false** == **false**
        - **false** **&&** **true** == **false       // 이미 false 네? 그럼 뒤에는 조건은 확인 안 할게**
        - **false** **&&**  **false** ==  **false    // 이미 false 네? 그럼 뒤에는 조건은 확인 안 할게**
- **||** (OR)
    - **두 조건이 모두 false** 일 때만 **false** 반환
        - **true** || **true** == **true               // 이미 true 네? 그럼 뒤에는 조건은 확인 안 할게**
        - **true** ||  **false** == **true             // 이미 true 네? 그럼 뒤에는 조건은 확인 안 할게**
        - **false** || **true** == **true**
        - **false** ||  **false** ==  **false**

⇒ 앞 조건이 결과 값에 영향을 주는 값으로 확정 날 경우, 뒤 조건은 PASS!

#### 오답 노트

<aside>

:q: 다음 코드가 실행되었을 때 변수 y의 최종 출력값으로 올바른 것을 고르시오.

```java
// 정수형 변수 x 선언 및 초기화
int x = 5;

// 정수형 변수 y 선언 및 초기화
int y = 10;

// bool 타입 변수 result 선언 및 초기화
// x 가 5 보다 크고, (y+1) 이 10보다 클때
// x 가 5 보다 작으므로 **false 값 바로 저장**하고 **&&** 의 특성상 **뒤의 연산 실행 X**
boolean result = (x > 5) && (++y > 10);

System.out.println(y);
```

**① 10**       //  연산 실행 PASS 했으니까 y 값은 그대로 유지

② 11

③ 0

④ 컴파일 에러 발생

</aside>

---

## 문제 번호 : 10

### 문제 내용

<aside>

:q: 1 부터 50까지 진행되는 369 게임 프로그램을 작성하시오.

규칙은 다음과 같습니다.

- **[규칙 1]** 숫자에 3, 6, 9가 포함되어 있다면 그 개수만큼 “짝”을 출력해야 합니다.
    - 예: 3 → “짝”
    - 예: 33 → “짝짝”
    - 예: 36 → “짝짝”
- **[규칙2]** 3, 6, 9가 하나도 포함되어 있지 않다면 숫자 자체를 출력합니다.

조건에 대해 참고하시오.

- **[조건 1]** 클래스 이름은 자유롭게 지정할 수 있습니다.
- **[조건 2]** 나누기 연산자(/)와 나머지 연산자(%)를 사용하여 십의 자리 숫자와 일의 자리 숫자를 분리하여 판별하시오.
- **[조건 3]** 한 줄에 숫자나 “짝”을 하나씩 출력하되, 아래의 출력 형식을 따르시오.

```java
1
2
짝
4
5
짝
...
29 (-> 9가 있으므로 "짝")
짝 (-> 30은 십의 자리가 3이므로 "짝")
짝 (-> 31은 십의 자리가 3이므로 "짝")
짝 (->32)
짝짝 (-> 33은 십의 자리3, 일의 자리 3이므로 "짝짝")
...
50
```

</aside>

#### 오답 노트

```java
// 내가 처음 썼던거...
public class Game {

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {

			if (i < 10 && i % 3 == 0) {
				System.out.println("짝");
			} else if (i >= 10 && (i / 10) % 3 == 0 && i % 3 == 0) {
				System.out.println("짝짝");
			} else if (i >= 10 && i % 3 == 0) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
```

```java
// 돌려 봤더니 왜 31, 32 이런애들은 박수 안쳐? ㅜㅜ 싶어서 다시 재작성해 본거...
public class Game {

	public static void main(String[] args) {

		// 숫자를 0부터 세진 않으니까 1부터 시작하게 변경
		for (int i = 1; i <= 50; i++) {

			if (i < 10 && i % 3 == 0) {
				System.out.println("짝");
			} else if (i >= 10 && (i / 10) % 3 == 0 && i % 3 == 0) {
				System.out.println("짝짝");
			} else if (i >= 10 && (i / 10) % 3 == 0) {
			
			// 30 자리수도 박수 쳐줘 하고 한줄 추가
				System.out.println("짝");
			} else if (i >= 10 && i % 3 == 0) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
```

⇒ 뭔가 3, 6, 9 게임엔 맞지 않아서 아래 코드 재재작성

---

#### **재재작성 정답 코드**

고친 코드에서도 19, 29 이런 친구들은 박수 안치고 12에서 박수를 치길래 뭐지? 

뭐지 하다가 보니… 369는 3의 배수 찾는 게임이 아니었음…

```java
public class Game {

	public static void main(String[] args) {
		// 369는 3, 6, 9 가 있으면 치는거임
		
		for (int i = 1; i <= 50; i++) {
			// 미리 자리수 분리			
			int ten = i/10; // 10의 자리수를 1의 자리수로 내려 3, 6, 9 비교
			int one = i%10; // 숫자가 10의 자리수일 때 1의 자리수만 남겨 3, 6, 9 비교
			
			// 자리수별 3, 6, 9, 체크 (true 가 되게)
			boolean tenCheck = (ten == 3 || ten == 6 || ten == 9);
			boolean oneCheck = (one == 3 || one == 6 || one == 9);
			
			//둘 다 3, 6, 9 일 때 = 박수 두번
			if (tenCheck && oneCheck) {
				System.out.println("짝짝");
			}
			// 하나만 3, 6, 9 일 때 = 박수 한번
			else if (tenCheck || oneCheck) {
				System.out.println("짝");
			}
			// 둘다 아닐 때 = 그대로 숫자
			else {
				System.out.println(i);
			}
			
		}
		
		
	}

}
```

---
