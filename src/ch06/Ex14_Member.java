package ch06;

public class Ex14_Member {
	// private 는 자체의 내용을 건드리지 않기 위함.
	//그러나 다른 파일에서 불러야할때가 있으니 게터와 세터 기능으로 사용가능하게 해줌
private String uid;
private String name;
private String password;
private int age;

public Ex14_Member() {}
public Ex14_Member(String uid, String name, String password, int age) {
	super();
	this.uid = uid;
	this.name = name;
	this.password = password;
	this.age = age;
}
public String getUid() {
	return uid;
//	System.out.println("a");
// 위의 경우는 명령 자체는 잘못되지않았지만 리턴으로 끝냈기때문에 그 뒤에 가동이 되진 않는다. 
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
