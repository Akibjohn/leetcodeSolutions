import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bigIntegerStr1=new BigInteger(num1);
        BigInteger bigIntegerStr2=new BigInteger(num2);
        BigInteger sum = bigIntegerStr1.add(bigIntegerStr2);
        StringBuilder sb=new StringBuilder();
        sb.append(sum);
        return sb.toString();
        
    }
}