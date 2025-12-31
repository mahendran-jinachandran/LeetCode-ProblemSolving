1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        
4        List<List<Integer>> res = new ArrayList<>();
5        if(nums.length < 3) {
6            return res;
7        }
8
9        Arrays.sort(nums);
10        for(int i = 0; i < nums.length - 2; i++) {
11            
12            if(i != 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            if(nums[i] > 0) {
17                break;
18            }
19
20            int left = i + 1;
21            int right = nums.length - 1;
22
23            while(left < right) {
24                int sum = nums[i] + nums[left] + nums[right];
25
26                if(sum == 0) {
27                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
28
29                    int leftVal = nums[left];
30                    while (left < right && nums[left] == leftVal) left++;
31
32                    int rightVal = nums[right];
33                    while (left < right && nums[right] == rightVal) right--;
34                } else if(sum < 0) {
35                    left++;
36                } else {
37                    right--;
38                }
39            }
40        }
41
42        return res;
43    }
44}