1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        
4        int n = nums.length;
5        List<List<Integer>> result = new ArrayList<>();
6
7        if(n < 4) {
8            return result;
9        }
10
11        Arrays.sort(nums);
12        for(int i = 0; i < n - 3; i++) {
13            
14            if(i > 0 && nums[i] == nums[i - 1]) {
15                continue;
16            }
17
18            for(int j = i + 1; j < n - 2; j++) {
19
20                if(j > i + 1 && nums[j] == nums[j - 1]) {
21                    continue;
22                }
23
24                int left = j + 1;
25                int right = n - 1;
26
27                while(left < right) {
28                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
29                    if(sum == target) {
30                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
31
32                        int leftVal = nums[left];
33                        while(left < right && nums[left] == leftVal) left++;
34
35                        int rightVal = nums[right];
36                        while(left < right && nums[right] == rightVal) right--;
37                    } else if(sum > target) {
38                        right--;
39                    } else {
40                        left++;
41                    }
42                }
43            }
44        } 
45
46        return result;
47    }
48}