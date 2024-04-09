import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentQuizScoreTester {
	public static void print(List<Student> student){
		System.out.println("Starting Gradebook:");
		System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s\n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
		for(int i = 0; i < student.size(); i++){
			if(student.get(i) != null){
				System.out.println(student.get(i));
			}
		}
	}
	public static void replaceName(Student student, String newName){
		student.setName(newName);
	}
	public static void replaceQuizScore(List<Student> student,int studentIndex, int quizNumber, int quizScore){
		student.get(studentIndex).setQuizValue(quizNumber,quizScore);
	}
	public static void replaceStudent(List<Student> student,String studentOriginalName, String studentNewName, int[] newStudentQuizScores){
		for(int i = 0; i < student.size(); i++){
			if(student.get(i).getName().equals(studentOriginalName)){
				student.get(i).setName(studentNewName);
				for(int j = 0; j < newStudentQuizScores.length; j++){
					student.get(i).setQuizValue(j+1,newStudentQuizScores[j]);
				}
				break;
			}
		}
	}
	public static void replaceStudentBefore(List<Student> student,String studentOriginalName, String studentNewName, int[] newStudentQuizScores){
		for(int i = 0; i < student.size(); i++){
			if(student.get(i).getName().equals(studentOriginalName)){
				student.add(i, new Student(studentNewName,newStudentQuizScores[0],newStudentQuizScores[1],newStudentQuizScores[2],newStudentQuizScores[3],newStudentQuizScores[4]));
				break;
			}
		}
	}
	public static void deleteStudent(List<Student> student,String studentOriginalName){
		for(int i = 0; i < student.size(); i++){
			if(student.get(i).getName().equals(studentOriginalName)){
				student.remove(i);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Miles Morales",95,72, 98, 94, 85));
		student.add(new Student("Fischl Narfidort",79,86,92,99, 89));
		student.add(new Student("Nene Kusanagi",87,90,95, 95, 100));
		student.add(new Student("Ciel Phantomhive",85,82, 88, 94, 99));
		student.add(new Student("Yuri Plisetsky",99, 93, 93, 81, 87));
		student.add(new Student("Mizuki Akiyama",100, 96, 97, 69, 94));
		student.add(new Student("Mikasa Ackerman",75,92, 88, 99, 95));
		student.add(new Student("Pela Sergeyevna",87,90,95, 95, 100));
		
		print(student);
		System.out.println("Called method to replace the name of a student. renamed student 1");
		replaceName(student.get(0), "Aoyagi Touya");
		System.out.println();
		replaceQuizScore(student,1,3,99);
		System.out.println("Called method to replace Quiz Score -- replaced quiz number 3 for student 1");
		print(student);
		System.out.println();
		replaceStudent(student,"Fischl Narfidort","Phoenix Wright",new int[]{95, 91, 83, 97, 82});
		System.out.println("Called method to replace a student. Replaced student 2 with diff name and new scores.");
		print(student);
		System.out.println();
		replaceStudentBefore(student,"Phoenix Wright", "Mafuyu Asahina",new int[]{100, 97, 89, 90, 97});
		System.out.println("Called method to add a student before the position of an existing student.");
		print(student);
		System.out.println();
		deleteStudent(student,"Mizuki Akiyama");
		System.out.println("Called method to delete a student from the list.");
		print(student);
	}
}