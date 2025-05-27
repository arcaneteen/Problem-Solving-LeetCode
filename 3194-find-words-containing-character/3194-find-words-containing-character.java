class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
        //Check if the char is present in each String ,if indexOf char doesn't return -1 ,then present
            if(words[i].indexOf(x)!=-1) list.add(i);
        }
        return list;
    }
}