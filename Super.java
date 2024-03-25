
public class Super {

	public static void main(String[] args) {
		SingleEventRegistration s1=new SingleEventRegistration("Hudson", "PlayAway", 2);
		TeamEventRegistration s2=new TeamEventRegistration("Aura","PlayAway", 1, 5);
//		s1.registerEvent();
		s2.registerEvent();
//		System.out.println("Thank You Hudson for your participation.Your registration fee is:"+s1.getRegistrationFee());
//		System.out.println("You are participant no:"+s1.getParticipantNo());
		System.out.println("Thank You Aura for your participation.Your registration fee is:"+s2.getRegistrationFee());
		System.out.println("You are Team no:"+s2.getTeamNo());
	}
}
class EventRegistration{
	private String name;
	private String nameOfEvent;
	private double registrationFee;
	EventRegistration(String name,String nameOfEvent){
		this.name=name;
		this.nameOfEvent=nameOfEvent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public void registerEvent(){
		if(nameOfEvent=="ShakeALeg") {
			this.registrationFee=100;
		}else if(nameOfEvent=="Sing&Win") {
			this.registrationFee=150;
		}else if(nameOfEvent=="Actathon") {
			this.registrationFee=70;
		}else if(nameOfEvent=="PlayAway") {
			this.registrationFee=130;
		}
	}
}
class SingleEventRegistration extends EventRegistration{
	private int participantNo;
	SingleEventRegistration(String name, String nameOfEvent,int participantNo) {
		super(name, nameOfEvent);
		this.participantNo=participantNo;
	}
	public int getParticipantNo() {
		return participantNo;
	}
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public void registerEvent(){
		super.registerEvent();
		this.participantNo=participantNo;
		}
	}
class TeamEventRegistration extends EventRegistration{
    private int noOfParticipants;
    private int teamNo;
	TeamEventRegistration(String name, String nameOfEvent,int noOfParticipants,int teamNo) {
		super(name, nameOfEvent);
        this.noOfParticipants=noOfParticipants;
        this.teamNo=teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public void registerEvent(){
		super.registerEvent();
		System.out.println(getRegistrationFee());
		this.setRegistrationFee(this.getRegistrationFee()*noOfParticipants);
		this.teamNo=teamNo;
		
	}
}