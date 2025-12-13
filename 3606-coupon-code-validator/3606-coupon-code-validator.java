import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);
        List<String[]> validCoupons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s1 = code[i];
            String s2 = businessLine[i];
            boolean s3 = isActive[i];
            if (validCode(s1) && validBusiness(s2) && s3) {
                validCoupons.add(new String[]{s2, s1});
            }
        }
        validCoupons.sort((a, b) -> {
            int cmp = Integer.compare(priority.get(a[0]), priority.get(b[0]));
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });
        List<String> ans = new ArrayList<>();
        for (String[] pair : validCoupons) {
            ans.add(pair[1]);
        }

        return ans;
    }

    public static boolean validCode(String s1) {
        return !s1.isEmpty() && s1.matches("^[a-zA-Z0-9_]+$");
    }

    public static boolean validBusiness(String s2) {
        return s2.equals("electronics") || s2.equals("grocery") || s2.equals("pharmacy") || s2.equals("restaurant");
    }
}
