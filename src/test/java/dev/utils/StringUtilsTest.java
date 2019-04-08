package dev.utils;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilsTest
{
	
	/*
    int c1 = StringUtils.levenshteinDistance("Chien", "Chine");
    System.out.println(c1);
    
    int c2 = StringUtils.levenshteinDistance("chien", "Chine");
    System.out.println(c2);
    
    int c3 = StringUtils.levenshteinDistance("chats", "chat");
    System.out.println(c3);
    
    int c4 = StringUtils.levenshteinDistance("distance", "instance");
    System.out.println(c4);
    
    int c5 = StringUtils.levenshteinDistance("distancE", "instance");
    System.out.println(c5);
    
   
    System.out.println(c6);
    
    int c7 = StringUtils.levenshteinDistance("C", "Chine");
    System.out.println(c7);
    
    int c8 = StringUtils.levenshteinDistance("Chien", "");  
   System.out.println(c8);*/
	
	
	@Test
	public void testLevenshteinDistance()
	{
		int c1 = StringUtils.levenshteinDistance("Chien", "");
		Assert.assertEquals(5, c1);
	
	}
	
	
	@Rule public ExpectedException exceptionLeve = ExpectedException.none();
	@Test
	public void testExceptLevenshteinDistance()
	{
		
		int c6 = StringUtils.levenshteinDistance(null, "chas ");
		Assert.assertEquals(5, c6);
		exceptionLeve.expect(NullPointerException.class);
		exceptionLeve.expectMessage("effectivement, ça plante");
	}
	
}
