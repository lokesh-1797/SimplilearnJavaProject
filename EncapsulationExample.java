package com.javaprograms;


	
	
	public class EncapsulationExample {
		
		//Public, Private, Protected, Default
		
		public void PublicMethod()
		{
			System.out.println("Priting Public Method");
		}
		
		private void PrivateMethod()
		{
			System.out.println("Priting Private Method");
		}
		
		protected void ProtectedMethod()
		{
			System.out.println("Protected Method");
		}
		
		void DefaultMethod()
		{
			System.out.println("Default Method");
		}
		
		public static void main(String args[])
		{
			EncapsulationExample e1 = new EncapsulationExample();
			e1.PublicMethod();
			e1.PrivateMethod();
			e1.ProtectedMethod();
			
			e1.DefaultMethod();
		}

}
