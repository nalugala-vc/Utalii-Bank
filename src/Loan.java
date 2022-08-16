
public class Loan {
	 int rate;
	double principal;
	double time;
	
	Loan(int rate,double principal,double time){
		this.rate=rate;
		this.principal=principal;
		this.time=time;
	}
	
	 double loan(double principal,double time ){
	  double interest=(principal*rate*time)	/100;
	  double Amount=interest+principal;
     return Amount;
     

}
}
