public class Telephone{
    String number, purpose;

    public Telephone(String number, String purpose){
        this.number = number;
        this.purpose = purpose;
    }
    public String toString(){
        return number +"\t"+ purpose ;
        }

    public String getNumber(){
        return number;
    }
    public String getPurpose(){
        return purpose;
    }

    public void updateTelephone(String number, String purpose){
        this.number = number;
        this.purpose = purpose;
    }
}