class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> seen = new HashSet<>();

        int point = 0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);

            if(!(seen.contains(ch))){
                if(ch>='a' && ch<='z'){
                    point += 1;
                }else if(ch>='A' && ch<='Z'){
                    point += 2;
                }else if(ch>='0' && ch<='9'){
                    point += 3;
                }else{
                    point += 5;
                }

                seen.add(ch);
            }
        }
        return point;
    }
}