Problem 1:- Bulls and Cows

1. Initialize variable cows and bulls.
2. Initialize 2 array of length 10 naming guessFreq and secretFreq.
3. Initialize a FOR loop to iterate through the secret and guess.
4. Inside the FOR loop, initialize 2 char variables guessChar and secretChar to keep check of characters.
5. Inside the FOR loop, initialize a IF condition to check if the guessChar is equal to the secretChar, if yes then increase bulls count by 1. And if not then increase the frequency of secretFreq and guessfreq.
6. Now make another loop, to check minimum of the secretFreq and guessFreq and store it in cows.
7. Finally return the bulls and cows in below format : bulls+"A"+cows+"B".

Problem 2 :- Count Number of Nice Subarrays

1. Initialize a function named countAtMost which takes one array and one integer as input.
2. Inside the function countAtMost , have variable left,right,oddCount, result assigned to 0.
3. Initialize a WHILE loop keeping the condition if right is less than length of arrya.
4. Iniside the WHILE loop, there is an if statement saying if the value of integer at index right in am array is even and not equal to 0 then increase oddCount by 1.
5. Now inside this WHILE loop have another WHILE loop with condition that oddCount gets greater than k,
6. Inside this WHILE loop, if the value is equal to even number not equal to 0 then decrease oddCount by 1 in that case and increase left.
7. The answer will be stored as result which is the sum of right-left + 1.
8. Finally return the answer.
9. Now you have to once pass real array with k and with k-1 and subtract them to get the final answer as output.

Problem 3 :-

1. Initialize a hash map named freq.
2. Initialize a FOR loop to iterate throught the array and get the 10 elements.
3. Inside the FOR loop have another string named dna which will have the substring.
4. Store the dna inside the freq has map.
5. Now Outside the FOR loop, initialize a List named list.
6. This list will storing the answers,
7. Now make another FOR loop to iterate through all answers and the strings to the list.
8. Finally return list as the answer/output.
