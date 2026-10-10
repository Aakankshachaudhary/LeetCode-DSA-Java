/*
Problem: Find Numbers with Even Number of Digits
Platform: LeetCode
Difficulty: Easy

Approach:
1. Traverse each element of the array.
2. Count the digits of each number.
3. If the digit count is even, increase the answer.
4. Return the final count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {

        int evenNumberOfDigits = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int count = 0;

            while (num > 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                evenNumberOfDigits++;
            }
        }

        return evenNumberOfDigits;
    }

  public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        FindNumbersWithEvenNumberOfDigits obj =
                new FindNumbersWithEvenNumberOfDigits();

        System.out.println("Answer: " + obj.findNumbers(nums));
    }
}
