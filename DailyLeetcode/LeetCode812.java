package DailyLeetcode;

public class LeetCode812 {
    public static void main(String[] args) {
        int arr[][] = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        int arr1[][] = {{4,6},{6,5},{3,1}};
        
        System.out.println(largestTriangleArea(arr));   // Expected output: 2.0
        System.out.println(largestTriangleArea(arr1));  // Example case
    }

    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        int n = points.length;

        // Try all triplets (i, j, k)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = triangleArea(points[i], points[j], points[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    // Compute area using shoelace formula
    private static double triangleArea(int[] a, int[] b, int[] c) {
        return Math.abs(
            a[0] * (b[1] - c[1]) +
            b[0] * (c[1] - a[1]) +
            c[0] * (a[1] - b[1])
        ) / 2.0;
    }
}
