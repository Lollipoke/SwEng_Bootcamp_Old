public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, SwEng !");
    System.out.println(computeUltimateQuestion());
  }

	public static String computeUltimateQuestion() {
	    return "The answer to the ultimate question of Life, The Universe, and Everything is: " + computeUltimateAnswer();
	}

	public static int computeUltimateAnswer() {
		return 6 * 7;
	}
}