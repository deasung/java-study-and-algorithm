

# 우선순위 큐(Priority Queue)란?
큐는 데이터를 일시적으로 쌓아두기 위한 자료구조
FIFo(First In First Out)의 구조
즉 먼저 들어온 데이터가 먼저 나가는 구조

PriorityQueue는 먼저 들어온 순서대로 
데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 
그 우선순위가 높은 엘리먼트가 먼자 나가는 자료구조

# Priority Queue의 특징
1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조 (큐에 들어가는 원소는 비교가 가능한 기준이 있어야함)
2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음
3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)

4. 응급실과 같이 우선순위를 중요시해야 하는 상황에서 쓰임


```java

import java.util.PriorityQueue; //import

//int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

//int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

//String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
PriorityQueue<String> priorityQueue = new PriorityQueue<>(); 

//String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
```

# Priority Queue 값 추가
```java
priorityQueue.add(1);     // priorityQueue 값 1 추가
priorityQueue.add(2);     // priorityQueue 값 2 추가
priorityQueue.offer(3);   // priorityQueue 값 3 추가
```
자바의 우선순위 큐에 값을 추가하고 싶다면 add(value) 또는 offer(value)라는 메서드를 활용하면 됩니다. add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환하고, 
큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생

# Priority Queue에서 우선순위가 가장 높은 값 출력
```java
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//int형 priorityQueue 선언
priorityQueue.offer(2);     // priorityQueue에 값 2 추가
priorityQueue.offer(1);     // priorityQueue에 값 1 추가
priorityQueue.offer(3);     // priorityQueue에 값 3 추가
priorityQueue.peek();       // priorityQueue에 첫번째 값 참조 = 1
```