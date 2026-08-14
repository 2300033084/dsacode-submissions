class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        HashSet<List<Integer>> hs = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            long k = (long) target - nums[i];

            for (int j = i + 1; j < nums.length - 2; j++) {
                long x = k - nums[j];

                int p1 = j + 1;
                int p2 = nums.length - 1;

                while (p1 < p2) {
                    long ans = (long) nums[p1] + nums[p2];

                    if (ans == x) {
                        hs.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[p1],
                            nums[p2]
                        ));
                        p1++;
                        p2--;
                    }
                    else if (ans < x) {
                        p1++;
                    }
                    else {
                        p2--;
                    }
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>(hs);

        // Sort quadruplets lexicographically
        result.sort((a, b) -> {
            for (int i = 0; i < 4; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });

        return result;
    }
}