/**
 * @Author: zjh
 * @Date: 2021/7/19 16:28
 * @Version 1.0
 * 深入理解虚拟机原题
 */
public class StringPool58Demo {

    //为什么一个是true，一个是false。是因为java底层已经默认在常量池中加载了一个名为“java”的字符串，当执行intern方法时，str2指向的引用，
    //与常量池中默认的“java”字符串引用不同，intern方法的作用是如果常量池存在相同对象，则返回对象的引用，否则常量池中新建字符对象并返回引用
    public static void main(String[] args) {

        String str1 = new StringBuilder("ali").append("baba").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1 == str1.intern()); //true
        System.out.println("*************************************************");

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern());//false

    }

}
