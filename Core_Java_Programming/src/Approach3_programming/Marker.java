package Approach3_programming;

public class Marker {
	private String brandname;
	private int height;
	private String[] bn={"cello","Reynolds","Parker"};
	
	public Marker(String brandname,int height) {
		if((checkBrandName( brandname)==1)&& (checkHeight( height)==1)) {
			this.brandname=brandname;
			this.height=height;
			
			
		}
		
		
	}
	private int checkBrandName(String brandname) {
		for(int i=0;i<bn.length;i++) {
			if(brandname==bn[i]) {
				return 1;
			}
		}return 0;
		
		
	}
	private int checkHeight(int height) {
		if((height >= 15) && (height <= 20)) {
			return 1;
		}
		return 0;
		
	}
	public void display() {
		System.out.println("The brand of marker is "+brandname);
		System.out.println("The height of marker is "+height+"cms "+(height/100.0)+" metres");
		
		
	}
	

}
