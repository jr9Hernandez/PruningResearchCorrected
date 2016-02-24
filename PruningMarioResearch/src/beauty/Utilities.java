package beauty;

public class Utilities {

	public Utilities(){}
	
	public double [] DistributionsQuadrants(double totalArea, double partialHeightWidthQ1, double partialHeightWidthQ2, double partialHeightWidthQ3, double partialHeightWidthQ4){
		
		double valuetoDistribute;
		
		double min=100000000;
		double secondmin=100000000;
		double counterMins=0;
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
				if (distributions[i]<secondmin && distributions[i]>min)
				{
					secondmin=distributions[i];
				}
			}
			
			for(int i=0;i<4;i++)
			{
				
				if (distributions[i]==min)
				{
					counterMins=counterMins++;
					
				}
			}
			
			if((totalArea/counterMins)> secondmin && secondmin!=100000000)
			{
				for(int i=0;i<4;i++)
				{
					if(distributions[i]==min)
					{
						distributions[i]=distributions[i]+(secondmin-distributions[i]);
						totalArea=totalArea-(secondmin-distributions[i]);
					}
				}	
				
			}
			else
			{
				valuetoDistribute=totalArea/counterMins;
				for(int i=0;i<4;i++)
				{
					if(distributions[i]==min)
					{
						distributions[i]=valuetoDistribute;
						totalArea=totalArea-valuetoDistribute;
					}
				}
			}
			
			
			
		}
		
		return distributions;
	} 
}
