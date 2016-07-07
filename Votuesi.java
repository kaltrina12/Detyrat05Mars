package ushtrime;

import javax.swing.*;
public class Votuesi {
	public static void main(String[]args)
	{
		int limit=10;
		int count=0;
		
		while(count<limit)
		{
			 String s=JOptionPane.showInputDialog("Miredita,ju lutem shkruani emrin tuaj");
				String t=JOptionPane.showInputDialog("Ju lutem shkruani mbiemrin tuaj");
				String i=JOptionPane.showInputDialog("Viti juaj i lindjes eshte?");
				int i1=new Integer(i).intValue();
				int mosha=2016-i1;
				if(i1>1998)
				
				{
					JOptionPane.showMessageDialog(null,"Na vjen keq por mosha juaj eshte "+mosha+" .Te drejte vote kane vetem personat mbi moshen 18 vjecare");
				
				}
					else
						
						
						{
						String g=JOptionPane.showInputDialog("Shtypni 1 ose 2 varesisht se cilin nga kandidatet doni ta votoni ");
					    int g1=new Integer(g).intValue();
					    
					    	if(g1==1)
					    {
					    	JOptionPane.showMessageDialog(null, "Faleminderit qe votuat per kandidatin numer 1");
					    	
					    	
					    	System.out.println("nje vote per kandidatin numer 1 ");
					    	
					    }
					    	
					    	else
					    	{
					    		if(g1==2)
					    			
							    {
							    	JOptionPane.showMessageDialog(null, "Faleminderit qe votuat per kandidatin numer 2");
							    	
							    	System.out.println("nje vote per kandidatin numer 2 ");
							    }
							  
					    	
					    	
					    	
					    	
			
					    	else
							 
					    {
					    		
					    	JOptionPane.showMessageDialog(null, "Gabim: lejohet te shtypet vetem 1 ose 2 pasi qe jane 2 kandidat' ");
					    }
					    count++;
							
						}
						
				     
				    	 
				     
				}
		
				
		
			   			    
			    
			    
		
	}
	}
}

	




	   
	


