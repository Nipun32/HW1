package HW8;
///import java.util.*;
/**
 * A class that has a methond to recursively replaces characters in a String.
 * 
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveStringReplace
{
    public String replace(String s, char from, char to)
    {
        String result = null;
        if (s.length() < 1) {
            return s;
          }
          else {
            char first = (from == s.charAt(0) )? to : s.charAt(0);
            result=result+first;
            replace(s.substring(1), from, to);
            return result;
          }}}
