class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>(dictionary);
        StringBuilder result=new StringBuilder();
        for(String word:sentence.split("\\s+")){
            String prefix="";
            for(int i=1;i<=word.length();i++){
                prefix=word.substring(0,i);
                if(set.contains(prefix)) break;
            }
            if(result.length()>0) result.append(" ");
            result.append(prefix);
        }
        return result.toString();
    }
}