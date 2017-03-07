package edu.umb.cs.cs680;

public class StringTest {
	public static String replace(String name,char original, char replace){
		char[] nameArray = name.toCharArray();
		char[] newArray = new char[name.length()];
		int i = 0;
		for(char c : nameArray){
			
			if(c == original){
				newArray[i] = replace;
			}
			else{
				newArray[i] = c;
			}
			i++;
		}
		return new String(newArray);
	}
	public static void main(String[] args) {
		String text = new String("Janmesh");
		String text2 = text.concat("Hello world");
		//text2 ="Hello world";
		System.out.println(replace("JanmeshJ", 'J','F'));
	}

}
