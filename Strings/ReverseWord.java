public class ReverseWord {
    public static void main(String[] args) {
        String str = "I love Java";
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            String reversed =" ";
            for(int j= words[i].length()-1;j>=0;j--){
                reversed += words[i] .charAt(j);


            }
            System.out.println(reversed+"");
        }
    }
}

