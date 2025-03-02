
public class Main
{
	public static void main(String[] args) {
// 		//alphabet or not
// 		char ch='P';
// 		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
// 		    System.out.println("alphabet");
// 		}
// 		else
// 		System.out.println("not a alphabet");
		
		
// 		//VOWEL or not
// 		char ch='u';
// 		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
// 		    System.out.println("vowel");
// 		}
// 		else
// 		System.out.println("not a vowel");
		
		
// 		//special symbol or not
// 		char ch='*';
// 		if(!(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')){
// 		    System.out.println("it is symbol");
// 		}
// 		else
// 		System.out.println("not a symbol");
		
		
// 		//to print ascii values of a given character
// 		char ch='p';
// 		int d=(int)ch;
// 		System.out.println(d);
		
		
		
// 		//to display length and first character and last character
// 		char arr[]={'a','x','3','@','m','7'};
// 		int d=arr.length;
// 		char p=arr[0];
// 		char q=arr[arr.length-1];
// 		System.out.println(d+","+p+","+q);
		



// 		//count alphabets,digits,symbols
// 			char arr[]={'a','x','3','@','m','7'};
//     		int c1=0,c2=0,c3=0;
//     		for (int i=0;i<=arr.length-1;i++){
//     		if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z'){
//     		    c1++;
//     		}
//     		else if(arr[i]>='0'&& arr[i]<='9'){
//     		    c2++;
//     		}
//     		else
//     		c3++;
//     		}
    		
//     		System.out.println(c1+","+c2+","+c3);






//print each character and length
// 		String s="coding";
// 		for(int i=0;i<=s.length()-1;i++){
// 		    System.out.println(s.charAt(i));
		    
// 		}
// 		System.out.println(s.length());
		
// 	//palindrome or not	
// 		String line="racecar";
// 		String rev="";
// 		for (int i=line.length()-1;i>=0;i--){
// 		    rev+=line.charAt(i);
// 		}
// 		if(line.equals(rev)){
// 		    System.out.println("palindrome");
// 		}
// 		else
// 		System.out.println("not a palindrome number");
	
	
// 	//sum of digits in a String
// 	String s="coding@3652";
// 	int sum=0;
// 	for(int i=0;i<=s.length()-1;i++){
// 	    char d=s.charAt(i);
// 	    if(d>='0'&&d<='9'){
// 	        int a=d-48;
// 	        sum +=a;
// 	    }
	    
// 	}System.out.println(sum);






// 	//ascii values of character in a String
// 	String s="coding";
// 	for(int i=0;i<=s.length()-1;i++){
// 	    int d=s.charAt(i);
// 	    System.out.println(d);
// 	}
	
// 	//display highest digit in a string
// 	String s="coding@3695";
// 	char max='0';
// 	for(int i=0;i<=s.length()-1;i++){
// 	    char a=s.charAt(i);
// 	    if(a>='0'&& a<='9'){
// 	        if(a>max){
// 	        max=a;
// 	        }
// 	    }
// 	}System.out.println(max);
	
// 	//split the string into words and display them and display the count
// 	String s="This is simple english sentence";
// 	int count=0;
// 	String[] words=s.split(" ");
// 	for(int i=0;i<=words.length-1;i++){
// 	    count++;
// 	    System.out.println(words[i]);
// 	}
// 	System.out.println("no of words count:"+count);


	
// 	//without using split method count the number of words
//     String s="This is simple english sentence";
// 	int count=0;
// 	for(int i=0;i<=s.length()-1;i++){
// 	    char d= s.charAt(i);
// 	    if(d==' '){
// 	        count++;
// 	    }
// 	}System.out.println("no of words in a string:"+(count+1));
	 
// 	//Anagrams or not
// 	String s1="players";
// 	String s2="parsely";
// 	int count=0;
// 	if(s1.length()==s2.length()){
// 	    for(int i=0;i<=s1.length()-1;i++){
// 	        for(int j=0;j<=s2.length()-1;j++){
// 	            if(s1.charAt(i)==s2.charAt(j)){
// 	                count++;
// 	            }
// 	        }
// 	    }
// 	    if(count==s1.length()){
// 	        System.out.println("two are anagrams");
// 	    }
// 	}
// 	 else
// 	 System.out.println("two are not anagrams");
	    
// 	//longest word in a given string
// 	String s="This is the longest sentence in English";
// 	String[] words=s.split(" ");
// 	String large=words[0];
// 	for(int i=1;i<=words.length-1;i++){
// 	    if(large.length()<words[i].length())
// 	    {
// 	        large=words[i];
// 	    }
// 	}System.out.println(large);
	
	//to remove duplicates in the string
	
    // public class Main
    // {
    // 	public static void main(String[] args) {
    // 	    String str="aaabbababaacccbab";
    // 	    String res="";
    // 	    boolean flag = false;
    // 	    for(int i=0;i<=str.length()-1;i++){
    // 	       flag =false;
    // 	        for(int j=0;j<=i-1;j++){
    // 	            if(str.charAt(i)==str.charAt(j)){
    // 	                flag=true;
    // 	                break;
    	                
    // 	            }
    // 	        }
    // 	        if(!flag)
    // 	            {
    // 	                res=res+str.charAt(i) ;
    	                
    // 	            }
    // 	        }
    // 	    System.out.println(res);
    // 	}
    // }
	
// 	//count the duplicates in a string
// 	String str="aaabbababbababababcccaaddc";
// 	String res="";
// 	boolean flag=false;
// 	for(int i=0;i<=str.length()-1;i++){
// 	    flag=false;
// 	    for(int j=0;j<=i-1;j++){
// 	        if(str.charAt(i)==str.charAt(j)){
// 	            flag=true;
// 	            break;
// 	        }
// 	    }
// 	   int count=0;
// 	   for(int j=0;j<=str.length()-1;j++){
// 	       if(str.charAt(i)==str.charAt(j)){
// 	          count++; 
	       
// 	   }
	        
// 	    }
// 	    System.out.println(str.charAt(i)+"--->"+count);
// 	}
	
	
	
	
// 	//remove spaces
// 	String s="This is a string";
// 	String p="";
// 	for(int i=0;i<=s.length()-1;i++){
// 	    char d=s.charAt(i);
// 	    if(d!=' '){
// 	        p+=d;
	        
// 	    }
// 	}System.out.println(p);
	  
// 	  //remove multiple spaces
// 	  String s="This   is  a    string";
// 	  StringBuilder sb=new StringBuilder(s);
// 	  for(int i=0;i<=sb.length()-1;i++){
// 	      char ch1=sb.charAt(i);
// 	      char ch2=sb.charAt(i+1);
// 	      if(ch1==' '&&ch2==' '){
// 	          sb.deleteCharAt(i);
// 	      }
	      
// 	  }
// 	  System.out.println(sb);
	  
	  //swap side-by-side
	  try{
    	  String s="abcde";
    	  char[] ch=s.toCharArray();
    	  for(int i=0;i<=ch.length-1;i=i+2){
    	      char temp=ch[i];
    	      ch[i+1]=ch[i];
    	      ch[i]=temp;
    	  }
    	  System.out.println(ch);
	      
	  }
	  catch(ArrayIndexOutOfBoundsException e){
	      System.out.print("out of index");
	  }
	  
	  
	  
	  
	    
	}

 }
