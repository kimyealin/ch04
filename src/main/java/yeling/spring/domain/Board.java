package yeling.spring.domain;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "MYBOARD")
//키 생성 테이블 전략
//@TableGenerator(name = "BOARD_SEQ_GENERATOR", table="ALL_SEQUENCES", pkColumnValue = "BOARD_SEQ", initialValue = 0, allocationSize=1)
//키 생성 시퀀스 전략
@SequenceGenerator(name="BOARD_SEQ_GENERATOR", sequenceName="BOARD_SEQUENCE", initialValue=1,allocationSize=1)
public class Board {
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE, generator="BOARD_SEQ_GENERATOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="BOARD_SEQ_GENERATOR")
	private  Long seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Long cnt;
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Long getCnt() {
		return cnt;
	}
	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}
	
}
