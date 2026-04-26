1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12
13        int beg = 1, end = n;
14        
15        while(beg <= end){
16            int mid = beg + (end - beg) / 2;
17            if(guess(mid) == 0) return mid;
18            else if(guess(mid) == 1) beg = mid + 1;
19            else end = mid - 1;
20        }
21        return 0;
22    }
23}