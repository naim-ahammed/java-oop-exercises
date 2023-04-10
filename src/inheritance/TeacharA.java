package inheritance;

public class TeacharA extends PersonA{

    private String qulaficiton;
    public String getQulaficiton(){
        return qulaficiton;
    }

    public void setQulaficiton(String qulaficiton){
        this.qulaficiton=qulaficiton;
    }



    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQulaficiton());    }

}
