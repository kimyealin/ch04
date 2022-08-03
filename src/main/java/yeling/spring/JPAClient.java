package yeling.spring;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import yeling.spring.domain.Board;

public class JPAClient {
	public static void main(String[] args) {
		//EntityManager 생성
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ch04");
		EntityManager manager = factory.createEntityManager();
		
		//트랜잭션 생성
		EntityTransaction tx = manager.getTransaction();
		
		try {
			tx.begin();
//			Board board = new Board();		
//			board.setTitle("JPA 테스트");
//			board.setWriter("사오정");
//			board.setContent("글 등록 테스트");
//			board.setRegDate(new Date());
//			board.setCnt(0L);
			
			//삭제할 게시글 조회
			Board deleteBoard = manager.find(Board.class, 1L);
			deleteBoard.setSeq(1L);
			manager.remove(deleteBoard); //실제삭제
			
			//글 목록 조회
//			String jpql = "select vo from Board vo order by vo.seq desc";
//			List<Board> boardList = manager.createQuery(jpql, Board.class).getResultList();
//			for(Board myboard : boardList) {
//				System.out.println("---> " + myboard.toString());
//			}
			
			//수정할 게시글 조회
//			Board board = manager.find(Board.class, 1L);
//			board.setTitle("글 수정 테스트");
						
			//글 상세 조회
//			Board searchBoard = manager.find(Board.class, 1L);
//			System.out.println("---> " + searchBoard.toString());
			//글 등록
//			manager.persist(board);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			manager.close();
			factory.close();
		}
	}
}
