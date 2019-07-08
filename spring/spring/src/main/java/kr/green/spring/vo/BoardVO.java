package kr.green.spring.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	
	private int num;
	private String title;
	private String contents;
	private String writer;
	private Date registered;
	private String file;
	private int views;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegistered() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");	//원하는 형식으로 시간을 보여주게 만드는 클래스
		return f.format(registered);	//변수 registered를 위의 형식으로 변환하여 반환
	}
	public void setRegistered(Date registered) {
		this.registered = registered;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", registered=" + registered + ", file=" + file + ", views=" + views + "]";
	}
	
	
	
	
	
}
