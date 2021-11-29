### `야구 게임 구현` ⚾, `로또번호 자동 추첨기 ` ️
---
* 따로 생각나는 마지막 주의 프로젝트 주제가 없어서 `숫자 야구게임`과 `로또번호 자동 추첨기`를 구현하려고 합니다.
* 숫자 야구게임 구현 규칙 출처https://github.com/code-squad/test-item-pool/blob/master/level2-common/level2.md
---
#### 요구사항
기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방의 수를 맞추면 승리한다.

[예] 상대방의 수가 425일 때, 123을 제시한 경우 : 1 스트라이크 456을 제시한 경우 : 1 스트라이크 1볼 789를 제시한 경우 : 낫싱

위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.

이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.

게임 진행 결과는 다음과 같다.

```
숫자를 입력해주세요 ex)123 : 123
1 스트라이크 1볼 
숫자를 입력해주세요 ex)123 : 145
1볼 
숫자를 입력해주세요 ex)123 : 671
2볼 
숫자를 입력해주세요 ex)123 : 216
1 스트라이크 
숫자를 입력해주세요 ex)123 : 713
3 스트라이크 
3개의 숫자를 모두 맞히셨습니다! 게임 종료
```

#### 프로그래밍 구현 제약사항
* 함수(또는 메소드) 하나의 크기가 최대 10라인을 넘지 않도록 구현한다.
* 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
* indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
  * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
* 전역 변수를 사용하지 않는다.

#### 힌트
* 컴퓨터가 3개의 값을 선택할 때 각 언어별 random 함수(또는 메소드) 또는 shuffle 함수(또는 메소드)를 이용하면 편한다.
* 반복문을 2중(반복문 안의 반복문)으로 사용하면 한번에 고려할 부분이 많다. 2중 반복문을 1중 반복문 2개로 나누어 처리하는 방법은 없는지 고려해 본다.
* indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.


#### 개인적인 목표
>- 기능별 구현 시 또는 유의미한 변경사항 있을 시 꾸준히 커밋하기.
>- Readme 꾸준하게 작성하기.
>- 시간은 빠듯하게 .. 😅
--- 
#### `2021.11.26 (금요일) Day -1`
- 상대편과 플레이어간의 게임이기 때문에 막연하게 Player와 Enemy 클래스를 생성했다. 코드를 짜다보니 굳이 필요없는 클래스란걸 느끼고 과감하게 지웠다.
- 처음에는 List 형태로 난수를 제작해서 다시 리턴받으려고 시도했다. 상대방이 주는 수가 123 234 이런식으로 3자리 수가 붙어져있는 형태이기 때문에 List<String> 형태로 해야하나? 고민하는데 시간이 많이 들었다.
- 그냥 List<Integer>로 바꾸고 구글링을 해보니 stream의 collect.joing() 메소드를 이용해서 리스트의 숫자들을 모두 합쳐주는 방법을 발견했고, 원래 알고 있던 subString() 메소드를 이용해서 3자리 숫자를 뽑아냈다.
- 내일은 게임의 결과를 나타내주는 gameResult 클래스를 채워갈 생각이다.

#### `2021.11.27 (토요일) Day -2`
- 딴 짓한다고 늦게 시작했다..ㅎㅎ
- strikeCount와 ballCount 를 인스턴스 변수로 생성해서 어느 메소드에서도 값을 저장할 수 있도록 설정했다.
- 볼 카운트 증가를 구현할 때 상당히 고민을 많이 했는데, 이중 for문을 사용해서 위치는 다르나 숫자가 일치하는 경우 볼 카운트를 증가하는 방법으로 구현했다.
- 하지만 이중 for문을 사용하는 과정에서 Depth 2를 넘기지 말라는 구현 규칙에 어긋났기 때문에 수정할 예정이다.
- 내일은 사용자가 숫자를 잘 못 입력한 경우에 대해 프로그램이 종료되지 않도록 코드를 추가하고 이중 for문을 따로 뗄 수 있도록 수정할 예정이다.

#### `2021.11.27 (일요일) Day -3`
- 플레이어가 3자리 수가 아닌 다른 자리 수를 입력했을 때, 예외가 나며 프로그램이 종료되는 것을 막기 위해 코드를 수정했다.
- while 문을 사용했고, 플레이어 입력이 != 3 이라면 다시 입력받도록 짜보았다.
- 2중 for문을 사용해서 볼 카운트를 뽑아냈었는데 구현 규칙에 Depth 3을 넘기지 마라는 규칙이 있어 따로 안 쪽 for문을 메소드로 빼놓았다.
- 하지만 이러나 저러나 비슷해보여서 이 방법이 최선은 아닌 것 같다고 느꼈다..ㅎㅎ;
- 이제 로또번호 자동 추첨기를 구현해보려고 한다.

#### `2021.11.28 (월요일) Day -4`
