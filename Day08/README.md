<!-- problem 1: - Nuts and bolts  -->

1. Initialize n as length of array.
2. Initailize res as count for result to 0.
3. An edge case if length of array is less than 3 then return 0.
4. Initialize a FOR loop, inside it have a IF statement with condition that if the current element is greater than both one element less than and greater than it then it is the peak of mountain.
5. Now inside this IF condition, have a variable name mountain assigned value to 1.
6. Initialize left to current index - 1,
7. Initialize right to current index + 1.
8. Now run 2 WHILE loop seperately.
   - In first loop, if the left is greater than 0 and value at left if less than value at left+1. then increase mountain count by 1 and decrease left by 1.
   - In second loop, if the right is less than length of array and value at right is less than value at right -1, than add 1 to mountain count and increase right by 1.
9. Finally intialize res to the maximum of res or mountain.
10. Return res as final answer.

<!-- problem 2: - Nuts and bolts  -->

1. Initialize a map with boolean data type to keep check of ASCII values of the characters.
2. Loop through the nuts array and fill the map with the characters present in the nuts array.
3. Initialize a variable index to keep check of index.
4. Run a FOR loop to check if the freq map contain true anywhere or not if yes then that means it had that character in nuts array. So place that character at it's correct place.
5. Also in the FOR loop, place the character to it's correct place in bolts array as well while incrementing the index variable by 1.
6. Having an index variable help keep check of index without having the need to run another FOR loop.
7. we are using (char) here to get the correct index of char in ASCII value. (for eg. @ = 64 in ASCII). and it is necessary to use (char) as the array is full of characters not integers.

<!-- problem 3 :- rotten oranges  -->

1. Initialize rows and cols to store length of rows and cols.
2. Also have freshCount variable and give it 0 as value.
3. Initialize a queue.
4. Run a FOR loop and inside it run another FOR loop.
5. Inside the FOR loop, if the the current value is equal to 2 then add the current element to the queue, else increase the fresh count by 1 if the current value is 1.
6. If the current freshCount is 0 then return 0.
7. Initialize minutes equals to 0.
8. Also initialize the directions with it's values as (-1,0),(1,0),(0,-1),(0,1).
9. Run a WHILE loopwith condition as the queue is not empty.
10. Initialize rotted as a boolean data type to false.
11. Run a FOR loop, and have cell variable and also have a x and y variable.
12. Run a FOR loop to check if any of the adjacent cells of a rotten orange have fresh oranges.
13. If yes then decrease freshcount and mark rotten as true.
14. At last if there is any rotten orange then increase minutes by 1.
15. Finally return -1 if there are still freshCount left else retuen the number of minutes.
