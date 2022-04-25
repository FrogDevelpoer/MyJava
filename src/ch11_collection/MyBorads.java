package ch11_collection;

import java.util.ArrayList;
import java.util.List;

public class MyBorads {
    public static void main(String[] args) {
        Board soo = new Board(10, "aaa", "김철수", "2022-02-09", 5);
        Board kim = new Board(9, "bbb", "김유신", "2022-02-09", 3);
        Board yoon = new Board(8, "ccc", "윤봉길", "2022-02-09", 8);

        List<Board> lists = new ArrayList<Board>();
        lists.add(soo);
        lists.add(kim);
        lists.add(yoon);
        lists.add(new Board(7, "ddd", "뿅뺭", "1996-08-28", 241));

        System.out.println("요소의 개수 : " + lists.size());

        BoardDao dao = new BoardDao(); // Dao 객체 생성
        dao.PushData(lists);
    }
}
