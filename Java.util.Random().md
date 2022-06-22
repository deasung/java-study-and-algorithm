# Java.util.Random()
-Random 클래스는 난수를 생성하는 클래스로 객체를 생성하여 사용


|함수|설명|
|------|---|
|boolean nextBoolean()|boolean형 난수 반환|
|int nextInt()|int형 난수 반환|
|int nextInt(int n)|0~n 미만의 정수형 난수 반환|
|long nextLong()|long형 난수 반환|
|void nextBytes(Byte[] bytes)||
|float nextFloat()|float형 난수 반환|
|double nextDouble()|double형 난수 반환|

nextInt를 제외하고는 대부분 해당 타입의 min~max값에 대한 난수를 생성한다.


```java
public class RandomTest{

    public static void main(String[] args){

        Random random = new Random();

        System.out.println( random.nextInt() ); // 1,700,703,373 (-2,147,483,648 ~ 2,147,483,647 사이의 값)
        System.out.println( random.nextInt(10) );  // 2.3279967568276427 (0 ~ 9 사이의 값)
        System.out.println( random.nextInt(10) + 1 );  // 2 (1 ~ 10 사이의 값)
        System.out.println( random.nextInt(10) * (-1) );  // -7 ( -9 ~ 0 사이의 값)
        System.out.println( random.nextBoolean() );  // true (true or false)

    }

}
```