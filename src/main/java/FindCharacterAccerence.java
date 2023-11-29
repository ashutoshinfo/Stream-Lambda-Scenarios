import java.util.Map;
import java.util.stream.Collectors;

public class FindCharacterAccerence {

	public static void main(String[] args) {
		String test = "Ashutosh";
		
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			System.out.println(c);
			
		}

		Map<Character, Long> charCountMap = test.chars()
		        .mapToObj(ch -> (char) ch)
		        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		System.out.println(charCountMap);


	}

}
