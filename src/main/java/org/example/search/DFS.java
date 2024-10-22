package org.example.search;

import java.util.ArrayList;

/**
 * packageName    : org.example.array
 * fileName       : DFS
 * author         : mac
 * date           : 10/22/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/22/24        mac       최초 생성
 */
//시간복잡도 O(V+E)
    //V: 노드 , E: 에지
//재귀 함수로 구현 , 스택 자료구조 이용
    //깊은 우선 탐색
//자료구조는 인접리스트 사용해야한다.
    //방문 배열을 사용해야한다.
    //1 -> 2,3
    //2 -> 5,6
    //3 -> 4
    //4 -> 6
    //5 ->
    //6 ->
    // 1 -> 3 -> 4 -> 6 -> 2-> 5
public class DFS {
    /**
     * 한번 방문한 노드를 다시 방문하면 안되므로 노드 방문 여부를 체크할 배열이 필요
     *
     */

    public static void main(String[] args) {

        ArrayList<Integer>[] dfsList = new ArrayList[5];
    }
}
