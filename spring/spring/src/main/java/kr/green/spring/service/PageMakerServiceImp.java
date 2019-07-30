package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;

@Service
public class PageMakerServiceImp implements PageMakerService {

	@Override
	public PageMaker getPageMaker(int displayPageNum, Criteria cri, int totalCount) {
	    PageMaker pm = new PageMaker();	//pageMaker 객체를 생성 후 복사
	    pm.setCriteria(cri);		//보여줄 게시글들의 설정을 수정
	    pm.setDisplayPageNum(displayPageNum);	//페이지네이션의 개수를 설정
	    pm.setTotalCount(totalCount);	//페이지네이션을 계산하기 위해 총 게시글 수를 수정
		return pm;
	}

}
