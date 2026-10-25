class Solution {
    public String defangIPaddr(String address) {
    //tocharArray : String to arrayStorage and then back to String

    char target = '.';
    String replacement = "[.]";

    char[] chars = address.toCharArray();
    StringBuilder result = new StringBuilder();

    for(int i = 0; i<chars.length; i++){
        if(chars[i] == target){
            result.append(replacement);
        }
        else{
            result.append(chars[i]);
        }
    }
    return result.toString();
    }
}
