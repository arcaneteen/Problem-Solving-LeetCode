class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char i=highCount(moves);
        moves=moves.replace('_',i);
        int farthest=0;
        for(char c:moves.toCharArray()){
            if(c=='L') farthest-=1;
            else farthest+=1;
        }
        return Math.abs(farthest);
    }
    char highCount(String moves){
        int c1=0,c2=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') c1++;
            else if(ch=='R') c2++;
        }
        return (c1>c2)?'L':'R';
    }
}