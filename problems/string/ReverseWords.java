package problems.string;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "  the sky is blue  ";
		ReverseWords r = new ReverseWords();
		//System.out.println(r.reverseWords(s));
		System.out.println(r.reverseWordsUsingCharArray(s));
	}
	
	public String reverseWordsUsingCharArray(String a) {
		char[] arr = a.toCharArray();
		int i;
		int n =arr.length;
		for (i=0; i < arr.length; i++) {
			while(i<n&&arr[i]==' '){
				i++;
			}
			int start = i;
			while(i<n&&arr[i]!=' '){
				i++;
			}
			int end = i-1;
			if(end<start){
				break;
			}
			reverseWord(arr,start,end);
		}
		reverseWord(arr, 0, arr.length-1);
		return removeExtraSpaces(arr);
	}
	
	private String removeExtraSpaces(char[] arr) {
		int index =0;
		boolean cond=false;
		for (int i = 0; i < arr.length; ) {
			if (arr[i]!=' ') {
				arr[index]=arr[i];
				index++;
				cond=true;
			} else {
				if (cond) {
					arr[index]=' ';
					index++;
					cond=false;
				}
			}
			i++;
		}
		if(index-1>=0&&index-1<arr.length&&arr[index-1]==' '){
			index--;
		}
		return new String(arr,0,index);
	}

	private void reverseWord(char[] arr, int start, int end) {
		for (int i = 0; i < (end-start+1)/2; i++) {
			char temp = arr[start+i];
			arr[start+i] = arr[end-i];
			arr[end-i]=temp;
		}
		
	}

	public String reverseWords(String a) {
		String[] words = a.split(" ");
		StringBuilder out = new StringBuilder();
		for (int i = words.length - 1; i >= 1; i--) {
			String temp = words[i];
			out.append(temp.trim());
			out.append(" ");
		}
		out.append(words[0]);
		return out.toString();
	}

	public String reverseWordsOld(String a) {
		if (a == null || a.length() == 0)
			return " ";
		if (a.length() == 1)
			return a;
		String[] arr = a.split(" ");
		String[] out = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			out[arr.length - 1 - i] = arr[i];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < out.length; i++) {
			if (out[i] != " ") {
				sb.append(out[i]);
				if (i != out.length - 1) {
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	}

	public String reverseWordsFailed(String a) {
		String output = "";
		if (a == null || a.length() == 0) {
			return output;
		}
		char[] arr = a.toCharArray();
		int i = 0;
		while (arr[i] == ' ') {
			arr[i] = '~';
			i++;
		}
		i = arr.length - 1;
		while (arr[i] == ' ') {
			arr[i] = '~';
			i--;
		}
		char[] out = new char[arr.length];
		int counter = arr.length - 1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == '~') {
				continue;
			} else if (arr[j] == ' ' && arr[j - 1] != ' ') {
				out[arr.length - 1 - j] = arr[j];
			} else if (arr[j] == ' ' && arr[j - 1] == ' ') {
				continue;
			} else {
				out[arr.length - 1 - j] = arr[j];
			}
		}
		output = new String(out);
		return output;
	}

}
