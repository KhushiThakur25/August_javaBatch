public class ReverseStLiterals {
  public static void main(String[] args) {
    String st = "This is java language..";
    char[] charArray = st.toCharArray();
        
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {  
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        for(int k = 0;k < charArray.length;k++){
          System.out.print(charArray[k] + " ");
        }
  }
}
