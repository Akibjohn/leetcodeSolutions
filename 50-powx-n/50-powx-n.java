class Solution {
    public double myPow(double x, int n) {
        int m = 1;
        if(n < 0){
            n *= -1;
            m = -1;
        }
        double ans = solve(x,n);
        if(m == -1){
            return 1/ans;
        }
        return ans;
    }
    
    public double solve(double x,int n){
        if(n == 0){
            return 1;
        }
        
        double faith = solve(x,n/2);
        double expectation = faith * faith;
        if(n%2 != 0){
            expectation *= x;
        }
        return expectation;
    }
}