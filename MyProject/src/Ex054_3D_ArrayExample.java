public class Ex054_3D_ArrayExample {
    public static void main(String[] args) {
        // 3차원 배열 선언 및 초기화
        int[][][] cube = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // 3차원 배열 값 출력
        for (int i = 0; i < cube.length; i++) {  // 층 반복
            System.out.println("층 " + (i + 1) + ":");
            for (int j = 0; j < cube[i].length; j++) {  // 행 반복
                for (int k = 0; k < cube[i][j].length; k++) {  // 열 반복
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}