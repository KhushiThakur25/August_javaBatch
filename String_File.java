public class String_File{
  public static void main(String[] args) {
    char[] arr = {'a','b','c','d','e'};
    String s = "riya";
    s.charAt(0) = 'p';
    for(int i = 0;i < arr.length;i++){
      if(arr[i] == 'c'){
        arr[i] = 'p';
      }
      System.out.println(arr[i]);
    }
  }
}