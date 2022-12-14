#로또 3주차 

## 기능 요구 사항 
로또 게임 기능을 구현해야 한다. 로또 게임은 아래와 같은 규칙으로 진행된다.

- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다. 
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원
    
  
      로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
      로또 1장의 가격은 1,000원이다.
      당첨 번호와 보너스 번호를 입력받는다.
      사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
      사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 종료한다.

## 기능 요구 구현 리스트

- [X] 로또 금액 입력 메소드 model#RandomNumber()
  - [X] 로또 금액이 입력 된 후 로또를 자동발행하는 메소드 - 1부터 45까지
  - [X] 예외사항 -
  

- [X] 로또 금액 가격 메소드 view#LottoPrice()
  - [X] 로또 금액 1,000원 단위로 입력받을수 있도록 구현하는 메소드 
  - [X] 예외사항 - 


- [X] 당첨 번호 메소드 view#LottoSixNumber()
  - [X] 당첨번호를 (,)로 받을 수 있는 메소드
  - [X] 예외사항 - 


- [X] 보너스 번호 메소드 Match#BonusCheck()
  - [X] 예외사항 - 


- [X] 사용자 구매한 로또, 당첨 번호 비교 model#LottoCompare()
- [X] 당첨 내역  model#RankList()
- [ ] 수익률 출력 Game#LottoReturn()
- [ ] 게임 종료  


- [X] 전체 예외처리 Validator()
- [X] 전체 Enum 적용 view()