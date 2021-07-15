public class Team {
	
	private String name;
	private Member [] members;
	private int memberCnt;
	private int maxMember;
	private int minAge;
	private int maxAge;
	
	public Team(String name, int maxMember, int minAge, int maxAge) {
		this.name = name;
		this.members = new Member[maxMember];
		this.memberCnt = 0;
		this.maxMember = maxMember;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	
	public void addMember(Member member) {
		if(memberCnt == maxMember) {
			System.out.println(name + " Team is not longer accepting applicants");
		}
		else {
			if(checkQualification(member)) {
				members[memberCnt] = member;
				memberCnt++;
				System.out.println("Welcome to the " + name + " Team!");
			}
			else {
				System.out.println("Sorry, you are not qualified to be a member.");
			}
		}
	}
	
	public void removeMember(Member member) {
		boolean memberHasBeenRemoved = false;
		for(int i = 0; i < memberCnt; i++) {
			if(members[i].equals(member)) {
				for(int j = i; j < memberCnt; j++) {
					members[j] = members[j + 1];
				}
				memberCnt--;
				memberHasBeenRemoved = true;
			}
		}
		if(memberHasBeenRemoved) {
			System.out.println("Member has been removed.");
		}
		else {
			System.out.println("Member is not found!");
		}
	}
	
	public boolean checkQualification(Member member) {
		return (member.getAge() >= minAge && member.getAge() <= maxAge);
	}
	
	public void displayTeamDetails() {
		System.out.println("Members in Team " + name);
		for(int i = 0; i < memberCnt; i++) {
			System.out.println((i+1) + ". " + members[i]);
		}
	}
}
