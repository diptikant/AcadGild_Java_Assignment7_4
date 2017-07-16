package Java_Assignment74;
/*
 * This class will help to master the String Handling concepts.
 */

import java.util.*;
public class Java_Assignment7_4 
{

	public static void main(String[] args) 
	{
		Anagram ob=new Anagram(); //Anagram class Instance
	    ob.getwords(); //Accepting the anagram words
	    ob.printJumble(); //printing the anagram words

	}

}

//Anagram class declaration
class Anagram
{ 
	String s[]=new String[20]; // string Array declaration
	int CntArr[] = new int[20]; // int Array declaration
	int i,n,l,j;
	String temp;
	Scanner sc=new Scanner(System.in); //Initializing the Scanner class
    public Anagram() //Anagram class constructor
    {
    	for(i=0;i<20;i++)
        {            
    		CntArr[i]=5;  //initializing the CntArr with 5       
        }
    }
    void getwords() //method to accept the words for Anagram checking
    {
        System.out.println("Enter no of words ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter anagram words");
            s[i]=sc.next();  
            CntArr[i]=1;//initializing the CntArr with 1
        }
    }
    void printJumble()
    {  
    	int f=0,l1=0,k,m=0,y=0;
    	String jword[]=new String[10];
        for(i=0;i<n;i++)
        {    
        	if(CntArr[i]==0)
        	{
        		continue;//to continue the loop
        	}
        	f=0;
        	y=0;
            temp=s[i];
            l=temp.length();
            jword[y]=temp;
            for(k=i+1;k<n;k++) //loop for checking the characters jumbling for finalizing the anagram words
            {
               f=0;
               l1=s[k].length();
               if(l==l1)
               {
                 
            	   for(j=0;j<l;j++)
            	   {
            		   for(m=0;m<l1;m++)
            		   {
            			   if(temp.charAt(j)==s[k].charAt(m))
            			   {
            				   f++;
            			   }
            		   }
               
            	   }
            
            	   if(f==l)
            	   {
            		   ++y;
            		   jword[y]=s[k]; //storing the anagram words
            		   CntArr[k]=0;//Reinitializing the Anagrams status
                 
            	   }
               }
           
            }
            if(y>0)
            {
                System.out.print("Anagram words are:");
                for(int x=0;x<=y;x++) //loop for printing the anagram words
                {
                	System.out.print("{"+jword[x]+"}"); 
                }
            
            }
          
            System.out.println(" ");
        }
    }
}