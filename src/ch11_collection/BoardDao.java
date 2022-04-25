package ch11_collection;

import java.util.List;

public class BoardDao {
    public void PushData(List<Board> lists) {
        System.out.println("목록을 출력합니다.");
        System.out.println("글번호\t제목\t작성자\t작성일자\t\t조회수");
        for(Board bean : lists){
            int no = bean.getNo();
            String title = bean.getTitle();
            String writer = bean.getWriter();
            String regdate = bean.getRegdate();
            int readcount = bean.getReadcount();

            String imsi = no + "\t\t" + title + "\t" + writer + "\t" + regdate + "\t" + readcount;
            System.out.println(imsi);
        }
    }
}
