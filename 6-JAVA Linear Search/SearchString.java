public class SearchString {
    public static void main(String[] args) {
        String name = "Pritam";
        char target = 'a';
        boolean ans = search(name, target) ;
        System.out.println(ans);
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }

        for(char ch : str.toCharArray()){ //Convet String to char array
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
