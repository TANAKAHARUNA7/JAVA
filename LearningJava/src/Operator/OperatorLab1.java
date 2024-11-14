package Operator;
class BitSet{
    int state = 0;

    // 비트 설정 메서드
    void setBit(int position, boolean value) {
        // 마스킹 변수 설정
        int mask = 1 << position;
        // position 위치에 비트 값 설정
        // value가 true면 | 연산과 쉬프트 연산(1 << position)을 사용해 position 위치에 있는 비트를 1로 설정
        if (value) {
            state |= mask;

            // vale가 false면 & 연산과 비트 반전(~)을 사용해 position 위치에 있는 비트를 0으로 설정
        } else {
            state &= mask;
        }
    }

    //비트 조회 메서드
    boolean getBit(int position) {
            // position 위치의 비트 값 반환
            // return 문과 함께 & 연산과 쉬프트 연산(1 << position)을 사용해 특정 위치의 비트 값을 확인
        return (state & (1 << position)) != 0;

        }
    }
public class OperatorLab1 {
    public static void main(String[] args) {
        // 메소드 작성 후 실행 예시:
        BitSet bitSet = new BitSet();
        bitSet.setBit(5, true); // 5번째 비트를 1로 설정
        System.out.println(bitSet.getBit(5)); // 출력: true
        System.out.println(bitSet.getBit(3)); // 출력: false
    }
    }

