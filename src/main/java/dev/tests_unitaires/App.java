package dev.tests_unitaires;

import dev.utils.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
       int c = StringUtils.levenshteinDistance("Chien", "Chine");
       
      System.out.println(c);
    }

}
