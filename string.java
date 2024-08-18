import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ans="";
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(str1[i].contains(str1[j])){
                    break;
                }}
            if(j==i){
                ans=ans+str1[i]+" ";
            }
        }
        ans=ans.trim();
        System.out.println(ans);
    }
}
