package Sample;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		int flag=0;
		for(int i=0;i<s1.length();i++)
		{
			flag = flag*10+Character.getNumericValue(s1.charAt(i));
		}
		System.out.println(flag);
		

	}

}
