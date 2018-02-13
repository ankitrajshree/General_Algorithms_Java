import java.util.Arrays;

public class LCSPrint {

    public static void printLCS( String x, String y, int xlen, int ylen ){
        int LCS[][] = new int[xlen+1][ylen+1];
        int lcslen  = 0 , i = 0, j=0;
        for ( i = 0; i<=xlen ;i++){
            for( j= 0;j<=ylen;j++){
                if ( i == 0 || j == 0){
                    LCS[i][j] = 0;
                }
                else if ( x.charAt(i-1) == y.charAt(j-1)){
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                }else {
                    LCS[i][j] = Math.max( LCS[i][j-1] , LCS[i-1][j]);
                }
            }
        }
        lcslen = LCS[xlen][ylen];
        int temp = lcslen;
        char[] lcs = new char[lcslen+1];
        lcs[lcslen]= '\0';
        i = xlen;
        j = ylen;
        while ( i>0 && j >0){
            if (x.charAt(i-1) == y.charAt(j-1)){
                System.out.println("Common Char"+x.charAt(i-1));
                lcs[lcslen-1] = x.charAt(i-1);
                i--;
                j--;
                lcslen--;
            }else if (LCS[i-1][j] > LCS[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        for ( i=0; i< temp;i++){
            System.out.print(lcs[i]);
        }
    }

    public static void main(String args[]){
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        printLCS(X, Y, m, n);
    }
}
