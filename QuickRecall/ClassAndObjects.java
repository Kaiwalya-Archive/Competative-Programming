package QuickRecall;

class College{
    int roll;
    String name;
    Boolean scholarship;

    void enterDetails(int roll, String name, Boolean scholarship){
        this.roll = roll;
        this.name = name;
        this.scholarship = scholarship;
    }
    int marks(int marks[]){
        int total=0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
}
public class ClassAndObjects {
    public static void main(String args[]){
        College student1 = new College();
        student1.enterDetails(1,"Kaiwalya",true);
        int marks[] = {92,95,98};
        System.out.println("Total marks of student are: "+student1.marks(marks));
    }
}
