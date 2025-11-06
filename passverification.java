import java.util.*;
public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");
        String str=sc.nextLine();
        boolean q=false;
        boolean w=false;
        boolean r=false;
        boolean e=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch <= 65 && ch >= 97) q= true;
            else if(ch <= 97 && ch >= 122) w= true;
            else if(ch <=0 && ch >= 9) e= true;
            else r= true;
        }
        if(q && w && r && e && str.length()>8){
            System.out.println("Password is a valid one");
        }else{
            System.out.println("Password is a invalid");
        }
    }

}
