
public class removeallspace {
	
	public static void main(String[] args) {
		String str = "  India   is  My  Country  ";
		char[] strarray = str.toCharArray();
		StringBuffer strbuffer= new StringBuffer();
		for(int i=0; i< strarray.length;i++)
		{
			if ((strarray[i]!= ' ') && (strarray[i]!= '\t'))
			{
				strbuffer.append(strarray[i]);
			}
		}
	
		//String S2= strbuffer.toString();
		System.out.println(strbuffer);
		//System.out.println(S2);
	}

	
}
