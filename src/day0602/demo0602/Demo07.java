package day0602.demo0602;

public class Demo07 {

    public static void main(String[] args) {
        char c = 'A';
        char[] charArray = new char[10];
        // for (int i = 0; i < charArray.length; i++) {
        // charArray[i] = (char) (c + i);
        // System.out.println("charArray[i] = " + charArray[i]);
        // }

        String str = "Hello Java";
        // 将字符串转换成字符数组
        str.toCharArray();
        String[] strArray = new String[5];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = str + i;
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

}
