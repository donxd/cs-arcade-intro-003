boolean checkPalindrome(String inputString) {
    boolean res = true;

    int maxPosition = inputString.length()-1;
    int halfPosition = inputString.length()/2;
    char [] elements = inputString.toCharArray();
    for ( int i=0, j=maxPosition; i != j && i < halfPosition; i++, j-- ){    
        if ( elements[ i ] != elements[ j ] ){
            res = false;
            break;
        }
    }
    
    System.out.println( "checkPalindrome(inputString) = "+ res );
        
    return res;
}
