class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(new ArrayList<>());
        }


        int trav = 0;
        int loc = 0;

        while(trav <s.length()){
            char search = s.charAt(trav);
            

            if(!list.get(loc).contains(search)){
                list.get(loc).add(search);
                
            }else{
                trav = loc;
                loc++;
                
            }

            trav++;
           
        }

        int max = 0;

        for(int i = 0;i<s.length();i++){
            if(max<list.get(i).size()){
                max = list.get(i).size();
            }
        }

        return max;
    }
}