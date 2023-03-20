# H-Index - 정렬

## 문제
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 `n`편 중, `h`번 이상 인용된 논문이 `h`편 이상이고 나머지 논문이 `h`번 이하 인용되었다면 `h`의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

### 제한사항
* 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
* 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

## 풀이
1. 논문의 인용 횟수가 담긴 배열 `citations`을 정렬한다.
2. 배열의 원소의 값을 `h`라고 했을 때 `h`가 원소의 값이 `h` 이상인 원소의 개수보다 크거나 같으면 `h` 이상인 원소의 개수가 H-Index이다.

예를 들어 배열을 정렬한 후 `citations = [0, 1, 3, 5, 6]`라고 가정하면 다음과 같이 연산된다.
* `h`가 0이고, `h` 이상인 원소의 개수는 5이므로 `0 >= 5`가 성립되지 않아 5는 H-Index가 아니다.
* `h`가 1이고, `h` 이상인 원소의 개수는 4이므로 `1 >= 4`가 성립되지 않아 4는 H-Index가 아니다.
* `h`가 3이고, `h` 이상인 원소의 개수는 3이므로 `3 >= 3`이 성립하여 H-Index는 3이다.
* `h`가 H-Index보다 큰 경우 `h`번 이상 인용된 논문이 `h`편 이상인 조건에 부합하지 않으므로 반복문을 종료한다.


```java
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++){
            if(citations[i] >= citations.length - i){
                answer = citations.length - i;
                break;
            }
        }
        
        return answer;
    }
}
```
