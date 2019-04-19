import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
    private static Pattern usrNamePtrn = Pattern.compile("^[a-zA-Z0-9_-]*$");
    public static boolean validateUserName(String userName){
        Matcher mtch = usrNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
   private static Pattern emailNamePtrn = Pattern.compile( "^[a-z0-9._@]*$");
    public static boolean validateEmailAddress(String userName){
        Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
private static Pattern pswNamePtrn = Pattern.compile("^[a-zA-Z@#$%0-9]*$");
    public static boolean validatePassword(String userName){
        Matcher mtch = pswNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
    public static void main(String a[]){
         
         Scanner sc = new Scanner(System.in);
         String user = sc.nextLine();  
         String email = sc.nextLine();
         String pass = sc.nextLine();
         
        System.out.println("Is "+ user+" a valid user name? " +validateUserName(user));
       System.out.println("Is " +email+ " a valid email address? "+validateEmailAddress(email));
       System.out.println("Is " +pass +" a valid password? " +validatePassword(pass));
      // type your code here
    }
}