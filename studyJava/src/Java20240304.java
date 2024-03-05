public class Java20240304 {

    public static void main(String[] args) {

        // for 문 기본 문법 구조
        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 10; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();

        // for 문의 특수한 형태(무한 루프)
        /*
        for(int i = 0;  ; i++) {
            System.out.print.(i+" ");
        }
        for(;;) {
            System.out.print("무한 루프");
        }
        */
        System.out.println();

        //무한 루프 탈출
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루프 탈출");

        //멀티 조건식
        for (int c = 0, d = 0; c < 5 || d < 5; c++, d++) {
            System.out.print(c + "_" + d + " ");
        }

        // while문
        int count = 0; //초기식
        while (count < 5) {
            System.out.print(count + " ");
            count++; //증감식
        }
//        // 의도적인 무한루프에서 while문은 자주 쓰임
//        while (true) {
        // 무한루프
        // 유저가 버튼 크릵할 떄 까지 대기
        // if (esc버튼 클릭)
        //  break;
    }

    // do ~ while 문
    {
        int cnt1 = 0;   // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        // 아래 while문과 비교하면,
        // 반복문의 조건이 처음부터 false인 경우,
        // do~while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!
        int cnt2 = 0;
        while (cnt2 < 5) {
            System.out.print(cnt2 + " ");

            // 이중 루프, 이중 반복문
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("[k=" + k + ", j=" + j + "]");
                }
            }
        }
    }
}