package beauty;

public class Utilities {

	public Utilities(){}
	
	public double [] DistributionsQuadrants(double totalArea, double partialHeightWidthQ1, double partialHeightWidthQ2, double partialHeightWidthQ3, double partialHeightWidthQ4){
		
		boolean firstIsmin=false;
		boolean secondIsmin=false;
		boolean thirdIsmin=false;
		boolean fourthIsmin=false;
		
		double min=100000000;
		double counterMins;
		double [] distributions=new double[4];
		distributions[0]=partialHeightWidthQ1;
		distributions[1]=partialHeightWidthQ2;
		distributions[2]=partialHeightWidthQ3;
		distributions[3]=partialHeightWidthQ4;
		
		while(totalArea>0)
		{
			for(int i=0;i<4;i++)
			{
				if (distributions[i]<min)
				{
					min=distributions[i];
				}
			}
			for(int i=0;i<4;i++)
			{
				if (distributions[i]==min)
				{
					counterMins=counterMins++;
					if(i==0)
					{
						firstIsmin=true;
					}
					if(i==1)
					{
						secondIsmin=true;
					}
					if(i==2)
					{
						thirdIsmin=true;
					}
					if(i==3)
					{
						fourthIsmin=true;
					}
				}
			}
			
			
		}
		
		return 0;
	} 
}
