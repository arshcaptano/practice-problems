package other;

public class Contractor extends Staff {

    Contractor(){

    }

    @Override
    public void assignStaffId() {
        System.out.println("Assign a red id");
    }

    public static void main(String []args){
        new Contractor().assignStaffId();
    }
}
