1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        List<List<Integer>> result = new ArrayList<>();
5        if(nums.length < 3) {
6            return result;
7        }
8
9        Arrays.sort(nums);
10        for(int i = 0; i < nums.length - 2; i++) {
11            if(i != 0 && nums[i] == nums[i - 1]) {
12                continue;
13            }
14
15            if(nums[i] > 0) {
16                break;
17            }
18
19            int left = i + 1;
20            int right = nums.length - 1;
21
22            while(left < right) {
23
24                int sum = nums[i] + nums[left] + nums[right];
25                if(sum == 0) {
26                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
27
28                    int leftVal = nums[left];
29                    while (left < right && nums[left] == leftVal) left++;
30
31                    int rightVal = nums[right];
32                    while (left < right && nums[right] == rightVal) right--;
33
34                } else if(sum > 0) {
35                    right--;
36                } else {
37                    left++;
38                }
39
40            }
41        }
42
43        return result;
44        
45    }
46}