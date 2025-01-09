Problem 1: - Maximum Product of the Length of Two Palindromic Subsequences

1. Initialize a variable n to store length of string.
2. Initialize an array to keep check of the longest palindrome.
3. Initialize a FOR loop to traverse through the string and check if it is palindrome or not.
4. Initialize a StringBuilder datatype variable named subseq to store all the palindromic subsequences.
5. Initialize another FOR loop inside the first FOR loop to traverse through the string and add the characters to subseq after checking the if case.

- Inside the FOR loop have an if statement with the condition that if the first and second character are not equal to 0 on bit masking then append the character to subseq.

6. Now Outside the FOR loop, inside first FOR loop have a if statement with the condition that if the subseq string is a palindrome or not. If it is then add it to the longestPalindrome array.
7. Now outside of the FOR loop, initialize a maxProduct variable to keep check of maximum product of 2 palindromic subsequence.
8. Initialize a FOR loop to traverse and multiply the palindromic subseqnces to get the maxProduct as answer.
9. You can now return the maxProduct as answer.
10. For checking if the string is palindrome or not ,you can make a function named isPalindrom() which takes a string as input.
11. Inside the function isPalindrome(), initialize variables named
    left to 0 and right to length of string - 1.
12. Now initialize a WHILE loop with condition low<= high.
13. Inside the WHILE loop have an if statement with the condition that if the character at index left is equal to character at index right or not, if yes then return true else return false and move left by a and take back right by 1.

Problem :- Count the Number of Incremovable Subarrays

1. Initialize variable count to 0 and n to length of the array.
2. Initialize a FOR loop to traverse through the array.
3. Inside the first FOR loop, Initialize the second FOR loop to maintain i and j pointers.
4. Inside the second FOR loop , have an if statement with the condition that if current i and j are part of incremovable subarray or not. if yes then increase the count by 1.
5. At last of the function return count.
6. For isIncremovableSubarray check have a function which returns a boolean.
7. The function isIncremovableSubarray() must take an array,a start and end value.
8. Inside the function, have variable n for length of array and prev to keep check of previous number.
9. Initialize a FOR loop, and have a if with a conditionthat the current value i must be less then or equal to end and equal to or more than start value then only it must continue.
10. Have another if statement to see if the current value is lesser than or equal previous value stored in prev, if yes then return false.
11. At last in the FOR loop set the prev to current value.
12. Return true at last of the function.
