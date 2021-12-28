class TimeDistance{
	TimeDistance(){
	
	}
	TimeDistance(double time,int distance){
		this.time = time;
		this.distance = distance;
	}
	public double time;
	public int distance;
}
class Frog {
	public static void main(String args[]){
	
		int[] result= null;
	
		try{
			result = new Frog().calculateFrogDistance(Double.parseDouble(args[0]));
		}catch (Exception e){
			System.out.println("No argument passed");
		}
		
		if(result !=null){
			System.out.println("Distance ="+result[0]);
			System.out.println("hope ="+result[1]);

		}
		
	}
	private int[] calculateFrogDistance(double time){
		TimeDistance  timeDistanceArray [] = new TimeDistance[3];
		timeDistanceArray[0] = new TimeDistance(1,5);
		timeDistanceArray[1] = new TimeDistance(2,3);
		timeDistanceArray[2] = new TimeDistance(3.5,1);

		int distance = 0;
		int arrayIndex = 0;
		int hope = 0;
		while(timeDistanceArray[arrayIndex].time <= time){

			distance = distance + timeDistanceArray[arrayIndex].distance;
			time = time - timeDistanceArray[arrayIndex].time;
			hope++;
			if( timeDistanceArray.length -1 > arrayIndex)
				arrayIndex ++;
			else
				arrayIndex = 0;
		

		}
		int result[] = new int[2];
		result[0]= distance;
		result[1]= hope;
		return result;
	}

}
