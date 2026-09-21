class Solution {
    public String minWindow(String s, String t) {
        int[] freqT= new int[123];
        int[] freqS= new int[123];
        int n=t.length();
        for(int i=0; i<n; i++) freqT[t.charAt(i)]++;
        int left=n, m=s.length(), r;
        for(r=0; r<m && left>0; r++){
            char c=s.charAt(r);
            if(freqS[c]<freqT[c]) left--;
            freqS[c]++;
        }
        if(left>0) return"";
        int l=0;
        while(true){
            char c=s.charAt(l);
            if(freqS[c]>freqT[c]){
                l++;
                freqS[c]--;
            }
            else break; 
        }
        String ans= s.substring(l,r);
        int len=r-l;
        if(len==n) return ans;
        while(r<m){
            char c=s.charAt(l);
            while(r<m){
                char ch=s.charAt(r);
                freqS[ch]++;
                if(ch==c) break;
                r++;
            }
            if(r>=m) return ans;
            r++;
            while(true){
                char ch=s.charAt(l);
                if(freqS[ch]>freqT[ch]){
                    l++;
                    freqS[ch]--;
                }
                else break;
            }
            if(len>r-l){
                ans=s.substring(l,r);
                len=r-l;
                if(len==n) return ans;
            }
        }
        return ans;
    }
}
