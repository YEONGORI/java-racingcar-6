package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();
        String[] cars = names.split(",");

        int len = cars.length;
        int[] cars_move = new int[len];

        int count;
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            count = Integer.parseInt(Console.readLine());
            System.out.println();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < len; j++) {
                if (Randoms.pickNumberInRange(1, 9) >= 4) {
                    cars_move[j] += 1;
                }
            }
            for (int j = 0; j < len; j++) {
                System.out.println(cars[j] + " : ");
                for (int k = 0; k < cars[j].length(); k++) {
                    System.out.print("_");
                }
            }
        }

        int max = 0;
        for (int i : cars_move) {
            if (i > max) {
                max = i;
            } else if (i == max) {

            }
        }
    }

    public static List<Integer> findMaxIndices(int[] arr) {
        List<Integer> maxIndices = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndices.clear();
                maxIndices.add(i);
            } else if (arr[i] == max) {
                maxIndices.add(i);g
            }
        }

        return maxIndices;
    }
}
