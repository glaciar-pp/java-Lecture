package mysql.erd.test;

import java.io.Serializable;
import java.util.Date;

/**
 * 댓글 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Reply implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 댓글 아이디. */
	private Integer rid;

	/** 댓글 내용. */
	private String rcontent;

	/** 등록 시간. */
	private Date regtime;

	/** 답글 여부. */
	private Integer ismine;

	/** 사용자 테이블. */
	private Users users;

	/** 게시판. */
	private Board board;

	/**
	 * 생성자.
	 */
	public Reply() {
	}

	/**
	 * 댓글 아이디을 설정합니다..
	 * 
	 * @param rid
	 *            댓글 아이디
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * 댓글 아이디을 가져옵니다..
	 * 
	 * @return 댓글 아이디
	 */
	public Integer getRid() {
		return this.rid;
	}

	/**
	 * 댓글 내용을 설정합니다..
	 * 
	 * @param rcontent
	 *            댓글 내용
	 */
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	/**
	 * 댓글 내용을 가져옵니다..
	 * 
	 * @return 댓글 내용
	 */
	public String getRcontent() {
		return this.rcontent;
	}

	/**
	 * 등록 시간을 설정합니다..
	 * 
	 * @param regtime
	 *            등록 시간
	 */
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	/**
	 * 등록 시간을 가져옵니다..
	 * 
	 * @return 등록 시간
	 */
	public Date getRegtime() {
		return this.regtime;
	}

	/**
	 * 답글 여부을 설정합니다..
	 * 
	 * @param ismine
	 *            답글 여부
	 */
	public void setIsmine(Integer ismine) {
		this.ismine = ismine;
	}

	/**
	 * 답글 여부을 가져옵니다..
	 * 
	 * @return 답글 여부
	 */
	public Integer getIsmine() {
		return this.ismine;
	}

	/**
	 * 사용자 테이블을 설정합니다..
	 * 
	 * @param users
	 *            사용자 테이블
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * 사용자 테이블을 가져옵니다..
	 * 
	 * @return 사용자 테이블
	 */
	public Users getUsers() {
		return this.users;
	}

	/**
	 * 게시판을 설정합니다..
	 * 
	 * @param board
	 *            게시판
	 */
	public void setBoard(Board board) {
		this.board = board;
	}

	/**
	 * 게시판을 가져옵니다..
	 * 
	 * @return 게시판
	 */
	public Board getBoard() {
		return this.board;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rid == null) ? 0 : rid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Reply other = (Reply) obj;
		if (rid == null) {
			if (other.rid != null) {
				return false;
			}
		} else if (!rid.equals(other.rid)) {
			return false;
		}
		return true;
	}

}
