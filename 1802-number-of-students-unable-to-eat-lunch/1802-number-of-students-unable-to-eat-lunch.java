class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroS=0,oneS=0;
        for(int i:students){
            if(i==1)  oneS++;
            else zeroS++;
        }
        for(int s:sandwiches){
            if(s==0){
                if(zeroS==0)  return oneS; //if now no one wants 0 all 1 will be hungry
                zeroS--;//if want the sandwich ,decrease that person;
            }
            else{
                if(oneS==0) return zeroS;//if no 1 type of sandwich demand all 0 demanding student will be hungry
                oneS--;//if demanded decrease count by 1 person;
            }
        }
        return 0;
    }
}