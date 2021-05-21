package simpleproj;
import java.util.Scanner;
public class subsetsum2 {
	static int set[]=new int[10];
	static int solvector[]=new int[10];
	//static int m;
	static int count=0;
	
	public void accept(int n) {
		Scanner sc = new Scanner(System.in);
		int t=0;
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
			set[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<(n-1-i);j++){
				if(set[j]>set[j+1]){
					t=set[j];
					set[j]=set[j+1];
					set[j+1]=t;
				}
			}
		}
	}
	
	public int check(int n, int m){
		
		
		if(n<=0) {
			throw new IllegalArgumentException("Array length should be greater than 0"); 
			
		}
		
		int tot_sum=0;
		accept(n);
		for(int i=0;i<n;i++){
			tot_sum=tot_sum+set[i];
		}
		if(m==0) {
			throw new IllegalArgumentException("Enter target sum greater than 0");
		}
		if(m>tot_sum){
			//System.out.println("Solution does not exist");
			throw new IllegalArgumentException("Enter target sum within the range of array elements");
		}
		else {
			subset(0,0,tot_sum,m);
		}
		if(count==0) {
			return -1;
		}
		else {
			return 1;
		}
		
		
	}
	
	static void subset(int sumsofar, int index, int remsum,int m){
		
		solvector[index]=1;
		if(sumsofar+set[index]==m){
			System.out.println("Solution number:"+(++count));
			for(int i=0;i<=index;i++){
				if(solvector[i]==1){
					System.out.println(""+set[i]);
				}
			}
		}
		else
			if(sumsofar+set[index]+set[index+1]<=m){
				subset(sumsofar+set[index],index+1,remsum-set[index],m);
			}
			if((sumsofar+remsum-set[index]>=m)&&(sumsofar+set[index+1]<=m)){
				solvector[index]=0;
				subset(sumsofar,index+1,remsum-set[index],m);
			}
		
		}
	
	
}
	


