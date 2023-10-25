package uebung5Figuren;



public class Quadrat{

	
	 private int seitenlaenge;
		
		public Quadrat( int seitenlaenge)
		{
			this.seitenlaenge=seitenlaenge;
		}
		
		

		public int getSeitenlaenge() 
		{
			return seitenlaenge;
		}

		public void setSeitenlaenge(int seitenlaenge) 
		{
			this.seitenlaenge = seitenlaenge;
		}

		
		
		public int getUmfang()
		{
			return (4*seitenlaenge);
		}
		
		
		/*public double getDiagonale()
		 * 
		 * {
		 *	return Math.sqrt(Math.pow(seitenlaenge, 4));
		 *	}
		 * 
		 */
		
		
		public int getFlaeche() 
		{
			return seitenlaenge*seitenlaenge;	
		}
	}
	
	

