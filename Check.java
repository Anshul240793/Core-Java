package test;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="((()())(()))";
		int rp=0,lp=0;
		for(int i=0;i<str.length();i++) {
			if(lp==0 && rp==0) {
				if(str.charAt(0)==')') {
					//System.out.println("invalid");
					break;
				}
			}
			if(str.charAt(i)=='(')
				++lp;
			if(str.charAt(i)==')')
				++rp;
		}
		if(rp==lp &&(rp!=0 || lp!=0))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
