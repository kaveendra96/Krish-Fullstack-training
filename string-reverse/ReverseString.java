import java.util.Stack;

class ReverseString {


	public static void main(String args[]){
			
		String text = "reverse text demo";
		ReverseString revString = new ReverseString();
		System.out.println(revString.reverseString(text));
	}
	private String reverseString(String text){
	
		Stack<Character> stack = new Stack<>();
		StringBuilder stringBuilder = new StringBuilder("");
			
		for(char letter : text.toCharArray()){
			stack.push(letter);
		}
		while(!stack.empty()){
			stringBuilder.append(""+stack.pop());
		}
		return stringBuilder.toString();
	}

}
