public class MyAssignment {
    public String reverseDoubleChar(String word) {
        String revWord = "";
        for(int i=0; i<word.length(); i++){
            revWord = word.charAt(i) + revWord;
            revWord = word.charAt(i) + revWord;
        }
        return revWord;
    }

    public int sumDigits(int n) {
        int rem, sum=0;
        while(n>0){
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }

    public String birthdayName(String name){
        return "Happy Birthday " +name+ "!";
    }

    public String missingFront(String str){
        String newStr = "";
        for(int i=3; i<str.length(); i++)
            newStr = newStr + str.charAt(i);
        return newStr;
    }

    public String swapEnds(String str) {
        String newStr = "";
        char f,l;
        if(str.length() == 1 || str.length() == 0)
            return str;

        f = str.charAt(0);
        l = str.charAt(str.length() - 1);
        newStr = newStr + l;
        for(int i=1; i<str.length() - 1; i++)
            newStr = newStr + str.charAt(i);
        newStr = newStr + f;

        return newStr;
    }

    public String everyOther(String str) {
        String newStr = "";
        for(int i=0; i<str.length(); i+=2)
            newStr = newStr + str.charAt(i);
        return newStr;
    }

    public String nonStart(String a, String b) {
        String str = "";
        for(int i=1; i<a.length(); i++)
            str = str + a.charAt(i);

        for(int i=1; i<b.length(); i++)
            str = str + b.charAt(i);
        return str;
    }

    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return a;
    }


    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13)
            return sum;
        sum = sum + a;
        if(b == 13)
            return sum;
        sum = sum + b;
        if(c == 13)
            return sum;
        sum = sum + c;

        return sum;
    }

    public boolean powerOfTwo(int n) {
        if (n==0)
            return false;
        if (n==1)
            return true;
        do{
            if(n%2 != 0)
                return false;
            n = n/2;
        }while(n !=1);
        return true;
    }

    public boolean hasPalindrome(String str) {
        String rev = "";

        boolean ans = false;
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args){
        MyAssignment obj = new MyAssignment();

        String orgStr = "Nazmun Nahar";
        obj.reverseDoubleChar(orgStr);
        int num = 155;
        obj.sumDigits(num);

        obj.birthdayName(orgStr);
        obj.missingFront(orgStr);
        obj.swapEnds(orgStr);
        obj.everyOther(orgStr);
        obj.nonStart(orgStr, "Rimi Eva");
        obj.fibonacci(5);
        obj.luckySum(1, 5, 13);
        obj.powerOfTwo(32);
        obj.hasPalindrome(orgStr);

    }
}
