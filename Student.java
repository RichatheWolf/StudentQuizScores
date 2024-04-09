
public class Student {
	private String sName;
	private int[] quizScores;
	
	public Student(String sName, int quiz1Score, int quiz2Score, int quiz3Score, int quiz4Score, int quiz5Score){
		// initialize instance variables
		this.sName = sName;
		quizScores = new int[5];
		quizScores[0] = quiz1Score;
		quizScores[1] = quiz2Score;
		quizScores[2] = quiz3Score;
		quizScores[3] = quiz4Score;
		quizScores[4] = quiz5Score;
		
	}
	public int getQuizValue(int quizNumber) {
		return quizScores[quizNumber];
	}
	
	public void setQuizValue(int quizNumber, int value) {
		quizScores[quizNumber-1] = value;
	}
	
	public String getName() {
		return sName;
	}
	public void setName(String n){
		sName = n;
	}
	@Override
	public String toString() {
		String result = String.format("%-20s", sName);
		for (int i = 0; i < quizScores.length; i++) {
			result += String.format("%-10s", quizScores[i]);
		}
		return(result);
	}
}
