package 培训.ErrorHandleing;

public class Account {
      private String account;
      private int left;

  public Account(String account, int left) {
    this.account = account;
    this.left = left;
  }

  public void save(double d){
        left +=d;
        System.out.println(left);
      }

      public void pay(double d) throws BNNNEException{
        left-=d;
        System.out.println(left);

        if(left<0){
          throw new BNNNEException();
        }
      }



}
