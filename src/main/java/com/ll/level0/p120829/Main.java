package com.ll.level0.p120829;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(70)); //1
        System.out.println(new Solution().solution(91)); //3
        System.out.println(new Solution().solution(180)); //4
    }
}

class Solution {
    public int solution(int angle) {
        int answer = 0;

        if(angle > 0 && angle < 90)
            answer = 1;
        else if(angle == 90)
            answer = 2;
        else if(angle > 90 && angle < 180)
            answer = 3;
        else
            answer = 4;

        return answer;
    }
}