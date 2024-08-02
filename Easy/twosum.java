// import java.util.Scanner;
class solution {
    public int[] twosum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}

public class twosum {
    public static void main(String args[]) {
        int nums[] = { 2, 3, 4, 7, 9 };
        int target = 16;
        solution sol1 = new solution();
        int res[] = sol1.twosum(nums, target);
        if (res.length == 0) {
            System.out.println("No any two index found to reach Target");
        } else {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }
    }
}