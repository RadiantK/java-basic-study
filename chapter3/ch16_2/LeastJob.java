package ch16_2;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("대기가 적은 상담원을 우선으로 호출합니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
	}

}
