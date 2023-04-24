package 培训.ErrorHandleing;

public class Student {
  private double assignmentScore;
  private double finalScore;

  public Student(int assignmentScore, int finalScore) {
    this.assignmentScore = assignmentScore;
    this.finalScore = finalScore;
  }

  public double getAssignmentScore() {
    return assignmentScore;
  }

  public void setAssignmentScore(double assignmentScore) {
    this.assignmentScore = assignmentScore;
  }

  public double getFinalScore() {
    return finalScore;
  }

  public void setFinalScore(double finalScore) {
    this.finalScore = finalScore;
  }

  public double avgScore() {
    try {
      if ( (this.assignmentScore + this.finalScore ) / 2 >= 60) {
        return (this.assignmentScore + this.finalScore ) / 2;
      } else {
        throw new Exception();
      }

    } catch (Exception e) {
      System.out.println("FA");
      return 0;
    }
  }
}
