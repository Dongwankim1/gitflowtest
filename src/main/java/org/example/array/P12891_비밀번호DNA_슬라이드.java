package org.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : org.example.array
 * fileName       : P12891_비밀번호DNA_슬라이드
 * author         : mac
 * date           : 10/21/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/21/24        mac       최초 생성
 */
public class P12891_비밀번호DNA_슬라이드 {
    static int myArr[] = new int[4];
    static int[] checkArr = new int[4];
    static int checkSecret = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken());  //9
        int P = Integer.parseInt(st.nextToken());  //8
        int Result = 0;
        char A[] = new char[S];


        A = bf.readLine().toCharArray(); // CCTGGATTG
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0 ){
                checkSecret++;
            }
        }

        for(int i=0; i<P;i++){ //부분문자열 처음 받을때 세팅
            Add(A[i]);
        }

        if(checkSecret == 4){
            Result++;
        }
        //슬라이딩윈도우
        for(int i=P; i<S;i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
        }





    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
