class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int[][] arr = new int[map.size()][2];
        int i = 0;
        for(int key : map.keySet()) {
            arr[i][0] = key;
            arr[i][1] = map.get(key);
            i++;
        }

        Arrays.sort(arr, (a,b) -> b[1]-a[1]);

        int res[] = new int[k];

        for(int j=0; j<k; j++) {
            res[j] = arr[j][0];
        }

        return res;
    }
}
