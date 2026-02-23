import java.util.*;

public class SubSeq {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(list);
        System.out.println(subseqw("","abc"));

    }
    public static void generate(String s, int index, String built) {
        if (index == s.length()) {
            System.out.println(built);
            return;
        }
        // Include current character
        generate(s, index + 1, built + s.charAt(index));
        // Exclude current character
        generate(s, index + 1, built);
    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            list.add(p); // add result to static list
            return;
        }
        char ch = up.charAt(0);
        // include current character
        subseq(p + ch, up.substring(1));
        // exclude current character
        subseq(p, up.substring(1));
    }
    static ArrayList<String> subseqw(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> li=new ArrayList<>();
            li.add(p);
            return li;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqw(ch+p,up.substring(1));
        ArrayList<String> right=subseqw(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
