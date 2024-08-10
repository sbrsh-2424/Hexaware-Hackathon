public class palindrome{
    public static void main(String args[]){
        // int r,sum=0,temp;
        // int n=10;


        // temp=n;
        // while(n>0){
        //     r=n%10;
        //     sum=(sum*10)+r;
        //     n=n/10;

        // }
        // if (temp==sum)
        // System.out.println("palindrome number");
        // else
        // System.out.println(" not palindrome number");

        String s = "malayalam";
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length/2; i++) {
            char temp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = temp;
        }

        String s1 = new String(c);
        System.out.println(s1);
        if (s.equals(s1)) System.out.println("Its a Palindrome");
        else System.out.println("Not a Palindrome");
    }
}