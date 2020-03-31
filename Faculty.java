class Faculty{
String uniName;
String facultyName;
List<Student>students;

public Faculty(String uniName,String facultyName){
  this.uniName=uniName;
  this.facultyName=facultyName;
  this.students=new ArrayList<>();
}

public void insertStudents(Student student){
this.students.add(student);
}

public double averageFacultyECTS(){
  double average=0;
  for(Student s:students){
     average+=s.ECTSCredits();
  }
  return average/students.size();
}
public void studentDetention(String name){
  for(Student s:students){
   	if(s.getName==name){
    	 students.delete(s);
  	  }
    }
}
