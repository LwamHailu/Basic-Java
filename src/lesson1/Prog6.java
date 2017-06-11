package lesson1;

public class Prog6 {
	public static String[] removeDups(String[] duplicate) {
		int index = 0;
		String[] input = new String[duplicate.length];
		for (int i = 0; i < duplicate.length; i++) {
			boolean dupl = false;
			for (int j = 0; j < index; j++) {
				if (duplicate[i].equals(input[j])) {
					dupl = true;
					break;
				}
			}
			if (!dupl) {
				input[index] = duplicate[i];
				index++;
			}
		}
		String[] arr4 = new String[index];
		for (int z = 0; z < index; z++) {
			arr4[z] = input[z];
		}

		return arr4;
	}

	public static void main(String[] args) {
		String[] temp1 = removeDups(new String[] { "horse", "dog", "cat", "horse", "dog" });
		for (String s : temp1)
			System.out.println(s);
	}

}
