package HomeWork_4;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] rev = new StringBuffer(str).reverse().toString().split("Z");
        StringBuffer newText = new StringBuffer();
        for (int i = rev.length - 1; i >= 0; i--) {
            newText.append(rev[i]).append(" ");
        }
        System.out.println(newText);
    }
}



