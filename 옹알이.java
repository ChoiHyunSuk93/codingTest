package codingTest;

public class 옹알이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] babbling = { "aya", "yee", "u", "maa", "wyeoo" };
		int answer = 0;
		
		for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            babbling[i] = babbling[i].replace("0", "");
            
            if(babbling[i].equals("")) answer++;
        }
		System.out.println(answer);
	}

	

}
