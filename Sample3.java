import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Sample3
{
public static void main(String args[])
{
 Pattern compile=Pattern.compile("[a-z]{7}[.][a-z]@[a-z]{5}[.][a-z]{3}");
 Matcher matcher=compile.matcher("krishna.g@gmail.com");
 while(matcher.find())
 {
  System.out.println(matcher.group());
 }
}
} 
