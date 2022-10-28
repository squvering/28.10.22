public class Kata {
  public static String killZeros(String str) {
       if(str.equals(""))
            return ""; String rez = "";
        
        int i = 0;
        while(str.charAt(i) == '0' && i < str.length() - 1)
            i++;
        for(; i < str.length(); i++) {
            rez += str.charAt(i);
        }
        return rez;
    }
  
  
    public static String reverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
  
  
    public static String sumStrings(String A, String B) {
        String a = killZeros(A);
        String b = killZeros(B);

        if(a.equals(""))
            return b;
        if(b.equals(""))
            return a;
        int n1 = a.length(), n2 = b.length(), next=0;
        String rez = "",aRev = "", bRev = "";

        aRev = reverse(a);
        bRev = reverse(b);


        if(n1 > n2) {
            for(int i=0; i < n2; i++) {
                rez = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) % 10 + rez;
                next = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) / 10;
            }
            rez = (aRev.charAt(n2) - '0') + next + rez ;
            rez = reverse(aRev.substring(n2 + 1, n1)) + rez;
        }
        else if(n2 > n1) {
            for(int i=0; i < n1; i++) {
                rez = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) % 10 + rez;
                next = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) / 10;
            }
            rez = (bRev.charAt(n1) - '0') + next + rez;
            rez = reverse(bRev.substring(n1 + 1, n2)) + rez;
        }
        else if(n2 == n1) {
            for(int i=0; i < n1; i++) {
                rez = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) % 10 + rez;
                next = ((aRev.charAt(i) - '0') + (bRev.charAt(i) - '0') + next) / 10;
            }
            if(next > 0)
                rez = next + rez;
        }

        return rez;
    }
}