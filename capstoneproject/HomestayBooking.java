package capstoneproject;

public interface HomestayBooking {

	public static void main(String[] args) {
		RoomDetails r1=new RoomDetails("Chethan","Deluxe", 1, 2);
		double totalbill=r1.calculateBill();
		System.out.println("BillId            : " +r1.getBillId());
		System.out.println("Customer Name     : " +r1.getCustomerName());
		System.out.println("No.of DaysOfStay  : " +r1.getNoOfDaysOfStay());
		System.out.println("Total Bill        : " +totalbill);
	}
}
interface RoomBillComponent{
	double TAX=12;
	double EXTRA_PERSON_CHARGE=500;
	double FOOD_CHARGE=800;
	float calculateBill();
}
class RoomDetails implements RoomBillComponent{
	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	static int counter=101;
	RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
	public void setNoOfExtraPersons(int noOfExtraPersons) {
		this.noOfExtraPersons = noOfExtraPersons;
	}
	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	public boolean validateNoOfDaysOfStay() {
		if (getNoOfDaysOfStay() > 0 && getNoOfDaysOfStay() <= 15) {
            return true;
        } else if (getNoOfDaysOfStay() <= 0) {
            System.out.println("Number of days of stay must be greater than 0.");
        } else {
            System.out.println("Number of days of stay must be less than or equal to 15.");
        }
		return false;
	}
	public boolean validateNoofExtraPerson() {
		if (getNoOfExtraPersons()<=2) {
            return true;
        } else if(getNoOfExtraPersons()>2){
            System.out.println("Extra persons more than 2 are not allowed");
        }
		return false;
	}
	public boolean validateTypeOfRoom() {
		if(getTypeOfRoom().equals("Standard")) {
			return true;
		}else if(getTypeOfRoom().equals("Deluxe")) {
			return true;
		}else if(getTypeOfRoom().equals("Cottage")) {
			return true;
		}
		return false;
	}
	public float calculateBill() {
		counter++;
	    this.billId=counter;
		double totalBill;
		validateTypeOfRoom();
		validateNoOfDaysOfStay();
		validateNoofExtraPerson();
		double baseroomfare=0;
		if(getTypeOfRoom().equals("Standard")) {
			baseroomfare=2500;
		}else if(getTypeOfRoom().equals("Deluxe")) {
			baseroomfare=3500;
		}else if(getTypeOfRoom().equals("Cottage")) {
			baseroomfare=5500;
		}
		totalBill=(getNoOfDaysOfStay()*baseroomfare) +getNoOfDaysOfStay()*(FOOD_CHARGE) + (EXTRA_PERSON_CHARGE* getNoOfExtraPersons());
		totalBill = totalBill + TAX*totalBill;
		return (float) totalBill;
		
	}
}