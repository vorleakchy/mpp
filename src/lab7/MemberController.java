package lab7;

public class MemberController {
	private static MemberController instance = new MemberController();
	
	private DataAccess<String, LibMember> dataAccess = new DataAccessImpl<String, LibMember>();
	
	private MemberController() {}
	
	public static MemberController getInstance() { return instance; }
	
	public LibMember addNewMember(LibMember member) {
		return dataAccess.add(member.getId(), member);
	}
	
	public LibMember getMemberById(String id) {
		return dataAccess.get(id);
	}
	
	public LibMember updateMember(LibMember member) {
		return dataAccess.update(member.getId(), member);
	}
}
