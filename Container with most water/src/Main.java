public class Main {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,1}));
    }

    private static int maxArea(int[] height) {
        int currentArea = 0;
        int maxArea = currentArea;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int a = Math.min(height[left], height[right]);
            int b = right - left;
            currentArea = a * b;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}