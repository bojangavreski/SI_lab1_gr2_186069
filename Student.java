import java.util.ArrayList;
import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades=new ArrayList<>();
    // constructor

    public Student(String index, String firstName, String lastName,ArrayList<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    //seters & getters

    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        //Done
        double sum=0;
        for(int x : grades){
            sum+=x;
        }

        return sum/grades.size();
    }

    public int ECTSCredits() {
        //Done
        int credits=6;
        int count=0;
        for(int x:grades){
            if(x>=6){
                count++;
            }
        }
        return count*credits;
    }
}

