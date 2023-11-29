package info.ashutosh.own;

public class Inteviewq {

	public static void main(String[] arg) {

		System.out.print(rev("Test"));
	}

	private static StringBuilder rev(String rev) {

		StringBuilder sb = new StringBuilder(); 
		

		for (int i = rev.length() - 1; i >= 0; i--) {
			sb.append(rev.charAt(i));
		}

		return sb;

	}// rev()

} // class

// s 
// String
//	H   |  SCP
//	t	|	t
//	ts	|	ts
// .	| .
// tseT	|	tseT	
//	

// StringBuilder
// 	H	| scp
//	t	|	t
// 

