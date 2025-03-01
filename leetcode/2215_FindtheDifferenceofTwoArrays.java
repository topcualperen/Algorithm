class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int j : nums2){
            set2.add(j);
        }
        
        HashSet<Integer> diffSet1 = new HashSet<>(set1);
        diffSet1.removeAll(set2);
        
        HashSet<Integer> diffSet2 = new HashSet<>(set2);
        diffSet2.removeAll(set1);

        List<Integer> list1 = new ArrayList<>(diffSet1);
        List<Integer> list2 = new ArrayList<>(diffSet2);

        return Arrays.asList(list1, list2);

    }
}
