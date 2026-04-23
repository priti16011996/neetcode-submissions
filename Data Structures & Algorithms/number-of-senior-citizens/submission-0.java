class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        
        for (String person : details) {
            // Age is at index 11 and 12
            int age = Integer.parseInt(person.substring(11, 13));
            
            if (age > 60) {
                count++;
            }
        }
        
        return count;
    }
}