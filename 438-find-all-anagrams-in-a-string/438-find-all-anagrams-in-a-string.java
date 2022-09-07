class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         int n=s.length();
        int m=p.length();
        List<Integer> ans=new ArrayList<>();
        if(m>n)
        {
            return ans;
        }
        int[] sfm=new int[26];
        int[] pfm=new int[26];
        for(int i=0;i<m;++i)
        {
            pfm[p.charAt(i)-'a']++;
            sfm[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pfm,sfm))
        {
            ans.add(0);
        }
        for(int i=m;i<n;++i)
        {
            sfm[s.charAt(i-m)-'a']--;
            sfm[s.charAt(i)-'a']++;
            if(Arrays.equals(pfm,sfm))
            {
                ans.add(i-m+1);
            }
        }
        return ans;
        
    }
}