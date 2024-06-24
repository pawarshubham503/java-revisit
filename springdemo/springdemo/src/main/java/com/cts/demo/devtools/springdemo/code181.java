package com.cts.demo.devtools.springdemo;


//swap char in string

public class code181 {





    public static void main(String[] args) {
        String str="GeeksForGeeks";
        System.out.println(swapPair(str));

    }

    private static String swapPair(String str) {
        // TODO Auto-generated method stub
       
        if(str==null || str.isEmpty())
        return str;
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length -1;i+=2){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        return new String(ch);
        
    }
}
