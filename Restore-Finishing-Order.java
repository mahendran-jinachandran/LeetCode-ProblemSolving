1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        
4        int friendsLength = friends.length;
5        int[] result = new int[friendsLength];
6        Set<Integer> fri = new HashSet<Integer>();
7
8        for(int i = 0; i < friendsLength; i++) {
9            fri.add(friends[i]);
10        }
11
12        int j = 0;
13        for(int i = 0; i < order.length; i++) {
14            if(fri.contains(order[i])) {
15                result[j++] = order[i];
16            }
17        }
18
19        return result;
20    }
21}