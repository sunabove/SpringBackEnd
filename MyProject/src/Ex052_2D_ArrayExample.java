public class Ex052_2D_ArrayExample {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 배열의 값 출력
        for (int i = 0; i < matrix.length; i++) { // 행 반복
            for (int j = 0; j < matrix[i].length; j++) { // 열 반복
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // 한 행이 끝날 때 줄 바꿈
        }
    }
}
