public class ReverseCharArray {
  public static void main(String[] args) {
    char[] c = {'a','b','b','c','d'};
    int i = 0;
    int j = c.length-1;
    while (i < j){
      char temp = c[i];
      c[i] = c[j];
      c[j] = temp;
      i++;
      j--;
    }
    for(int k = 0;k < c.length;k++){
      System.out.print(c[k] + " ");
    }
  }
}
