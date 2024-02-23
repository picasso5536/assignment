import com.game.baseball.dto.compBall;
import com.game.baseball.dto.userBall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



    }

    public compBall generateNumber(){ // 컴퓨터 숫자 생성
        compBall cBall = new compBall();

        return cBall;
    }

    public userBall getUserNumber() throws IOException { // 사용자 숫자 입력
        userBall uBall = new userBall();

        System.out.println("서로 다른 숫자 세 개를 입력하세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String uBall = br.readLine();
        return uBall;
    }
}