package mc.ys.lesson8;

public class StringEx {

    public static void main(String[] args) {
        StringEx s = new StringEx();
        s.test1();
        s.test2();
        s.test3();
    }
    
    public void test1() {
        String number = "123456";
        
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int n = number.charAt(i) - '0';
            sum += n;
        }
        
        System.out.println(sum);
    }
    
    public void test2() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        System.out.println(str1 == str2); // false
    }
    
    public void test3() {
        String str1 = "Hello";
        String str2 = "Hello";
        
        System.out.println(str1 == str2); // true
    }
}
