package ch08;

public class Q04_Main {

	public static void main(String[] args) {
		Q04_DbWork dao = new Q04_DbWork();
		Oracle oracle = new Oracle();
		MySql mySql = new MySql();
		
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//		
//		mySql.select();
//		mySql.insert();
//		mySql.update();
//		mySql.delete();
		
		dbWork(oracle);
		dbWork(mySql);
	

	}
	static void dbWork(Q04_DbWork dbWork) {
		dbWork.select();
		dbWork.insert();
		dbWork.update();
		dbWork.delete();
	}
}
