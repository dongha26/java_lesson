package koreait.test1;

public class Person {
	static final int FRIENDS = 1;
	static final int FAMILY= 2;
	static final int BUSINESS = 3;
	private String name;
	private String mobile;
	private int group;
	@Override
	public String toString() {
		return "[name=" + name + "] mobile=" + mobile + ", 그룹=" +(group==1?"친구":group ==2?"가족":"비지니스"); 
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name,String moblie) {
		this.name =name;
		this.mobile = mobile;		
	}
	public Person(String name,String moblie,int group) {
		this.name =name;
		this.mobile = mobile;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public static int getFriends() {
		return FRIENDS;
	}
	public static int getFamily() {
		return FAMILY;
	}
	public static int getBusiness() {
		return BUSINESS;
	}
	
}
