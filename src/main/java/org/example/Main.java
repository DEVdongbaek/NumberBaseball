package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) {

        // 유저가 생성한 숫자가 중복이 있는지 체크
        while (true) {

            // 유저의 숫자 4개를 입력받는 기능
            Scanner sc = new Scanner(System.in);
            int[] userNums = new int[4];

            for (int i = 0; i < 4; i++) {
                userNums[i] = sc.nextInt();
            }

            int[] resultArr = Arrays.stream(userNums).distinct().toArray();

            if (resultArr.length == 4) {
                break;
            }

            System.out.println(resultArr);
            cnt++;
        }
    }
}