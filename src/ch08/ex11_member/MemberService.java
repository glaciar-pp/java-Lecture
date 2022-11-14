package ch08.ex11_member;

public interface MemberService {
	public abstract void register(String id, String password, String name);

	public abstract void printAllMembers();

	Member findById(String id);

	boolean login(String id, String password);

	public abstract void logout(String id);
}
