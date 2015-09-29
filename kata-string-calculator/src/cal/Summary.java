package cal;

public class Summary {

	private Integer sum;
	
	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Summary(){
		sum=0;
	}
	public Integer Add(String str)
	{	
		if(str=="")
			return 0;
		String [] strNum = str.split(",");
		if(strNum.length==0)
			return 0;		
		for(int j=0;j<strNum.length;j++){
			sum+=Integer.parseInt(strNum[j]);
		}
		return sum;
	}
}
