import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Sample
{
public static void main(String args[])
{
 Pattern compile=Pattern.compile("[A-Z][a-z]{6}");
 Matcher matcher=compile.matcher("Krishna");
 while(matcher.find())
 {
  System.out.println(matcher.group());
 }
}
} 
