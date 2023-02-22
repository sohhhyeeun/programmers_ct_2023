package com.ll.level0.p120807;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2,3)); //-1
        System.out.println(new Solution().solution(11,11)); //1
        System.out.println(new Solution().solution(7,99)); //-1
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        if(num1 == num2)
            answer = 1;
        else
            answer = -1;

        return answer;

        //return num1 == num2 ? 1 : -1;
    }
}