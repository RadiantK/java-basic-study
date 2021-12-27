package ch03;

public class TextBlockTest {

	public static void main(String[] args) {

		String textBlocks = """
				Hello,
				how r u,
				very,
				good""";
		
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					<body>
				</html>""";
	}

}
