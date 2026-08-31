class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int[] ps = new int[arr.length];
        ArrayList<Integer> a = new ArrayList<>();
        ps[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            ps[i] = ps[i-1]+arr[i];
        }
        
        for(int i =0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int mean = right-left+1;
            int res =0;
            if(left == 0){
                res = ps[right]/mean;
                a.add(res);
            }
            else{
                res = (ps[right] - ps[left-1])/mean;
                a.add(res);
            }
        }
        return a;
    }
}