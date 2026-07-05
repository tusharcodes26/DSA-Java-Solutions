public class rotateString {

    // Brute Force
    // public boolean rotate(String s, String goal){
    //     if(s.length() != goal.length()){
    //         return false;
    //     }

    //     for(int i = 0; i < s.length(); i++){
    //         String rotated = s.substring(i) + s.substring(0,i);
    //         if(rotated.equals(goal)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // Optimal Approach
    public boolean rotate(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        String doubledS = s + s;

        return doubledS.contains(goal);
    }

     public static void main(String[] args) {
        rotateString sol = new rotateString();

        String s1 = "rotation";
        String goal1 = "tionrota";
        System.out.println(sol.rotate(s1, goal1)); 
    }
}
