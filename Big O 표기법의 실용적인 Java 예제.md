# Big O 표기법의 실용적인 Java 예제


# O(1)
O(1)는 일정한 복잡도(constant complexity)라고 하며, 입력값이 증가하더라도 시간이 늘어나지 않는다.
다시 말해 입력값의 크기와 관계없이, 즉시 출력값을 얻어낼 수 있다는 의미

```java
int n = 1000;
System.out.println("Hey - your input is: " + n);
```

```java
int n = 1000;
System.out.println("Hey - your input is: " + n);
System.out.println("Hmm.. I'm doing more stuff with: " + n);
System.out.println("And more: " + n);
```

<hr/>

# O(n)
O(n)은 선형 복잡도(linear complexity)라고 부르며, 입력값이 증가함에 따라 시간 또한 같은 비율로 증가하는 것을 의미한다.

- 활용예시 
  - binary search(이진 탐색 알고리즘)

```java
for (int i = 1; i < n; i = i * 2){
    System.out.println("Hey - I'm busy looking at: " + i);
}
```