
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            char[] base = strs[i].toCharArray();
            Arrays.sort(base);
            String baseKey = new String(base);

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) continue;

                char[] comp = strs[j].toCharArray();
                Arrays.sort(comp);

                if (baseKey.equals(new String(comp))) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            res.add(group);
        }

        return res;
    }
}