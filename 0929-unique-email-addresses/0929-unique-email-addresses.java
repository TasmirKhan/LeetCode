class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails){
            boolean domsep = false;
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < email.length() ; i++){
                if(!domsep && email.charAt(i) == '.'){continue;}
                if(!domsep && email.charAt(i) == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    sb.append('@');
                    domsep = true;
                }
                else{ 
                    sb.append(email.charAt(i));
                    if(email.charAt(i) == '@') domsep = true;
                }
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}