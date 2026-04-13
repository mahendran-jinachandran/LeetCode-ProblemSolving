1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        int boatCount = 0;
4        Arrays.sort(people);
5        
6        int left = 0;
7        int right = people.length - 1;
8        
9        while(left <= right){
10            int sum = people[left] + people[right];
11            if(sum <= limit){
12                boatCount++;
13                left++;
14                right--;
15            }
16            else{
17                boatCount++;
18                right--;
19            }
20        }
21        return boatCount;
22    }
23}