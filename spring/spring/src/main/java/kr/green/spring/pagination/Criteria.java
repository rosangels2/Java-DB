package kr.green.spring.pagination;

public class Criteria {
		
		private int page; //현재 페이지
		private int perPageNum;	//한 페이지 당 컨텐츠 갯수
		
		public Criteria() {	//기본 생성자
			this.page = 1;
			this.perPageNum = 10;
		}
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			if(page <= 0) {		//현재 페이지 번호를 음수로 설정하려 할 때
				this.page = 1;
			}
			else
				this.page = page;
		}
		public int getPerPageNum() {
			return perPageNum;
		}
		public void setPerPageNum(int perPageNum) {
			if(perPageNum <=0 || perPageNum > 100) {	//한 페이지당 컨텐츠 개수를 100개까지로 제한
				this.perPageNum = 10;
			}
			else
				this.perPageNum = perPageNum;
		}
		@Override
		public String toString() {
			return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
		}
		/* 쿼리문에서 limit에 사용되는 인덱스를 계산하는 getter */
		public int getPageStart() {
			return (this.page -1) * perPageNum;	//쿼리문 limit 번지, 개수; 에서 번지를 결정 하기 위한 코드
		}
	
}
