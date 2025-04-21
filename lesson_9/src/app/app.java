package app;

import java.util.Scanner;

public class app {
    public static int findString(String str, String findStr) {
        int index = -1;
        int[] prefStr = pref(findStr);
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            while(j>0 && findStr.charAt(j) != str.charAt(i)) {
                j = prefStr[j-1];
            }
            if(findStr.charAt(j) == str.charAt(i)) {
                j++;
            }
            if(j == prefStr.length) {
                index = i - findStr.length() + 2;
                return index;
            }
        }
        return index;
    }

    public static int[] pref(String str){
        int[] arr = new int[str.length()];
        int index = 0;
        for(int i=1;i<str.length();i++){
            index = arr[i-1];
            while(index > 0 && str.charAt(index) != str.charAt(i)){
                index = arr[index-1];
            }
            if(str.charAt(index) == str.charAt(i)){
                index++;
            }
            arr[i] = index;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, find;
        str = sc.nextLine();
        find = sc.nextLine();
        if(findString(str, find) != -1) {
            System.out.println("Подстрока " + find + " встречается в строке " + str
                    + " начиная с индекса " + findString(str, find));
        }
        else{
            System.out.println("Подстрока не найдена!");
        }
    }
}