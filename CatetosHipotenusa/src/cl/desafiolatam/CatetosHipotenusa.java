package cl.desafiolatam;

import java.util.*;

public class CatetosHipotenusa {
	
	
	
	//double catetoA = 0;
	//double catetoB = 0;
	//double hipotenusa = 0;

	public static void main(String[] args) {
	
		/*double catetoA = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un cateto");
        double catetoB=sc.nextDouble();  
        System.out.println("ingrese el otro cateto");
        double hipotenusa=sc.nextDouble(); 
        catetoB=Math.sqrt((catetoA*catetoA+hipotenusa*hipotenusa));
        System.out.println(catetoB); */
		
		double catetoA = 0;
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ingrese un hipotenusa");
        
        double hipotenusa=sc.nextDouble();  
        
        System.out.println("ingrese cateto");
        
        double catetoB=sc.nextDouble(); 
      //  catetoB=Math.sqrt((catetoA*catetoA+hipotenusa*hipotenusa));
       
        catetoA=Math.sqrt((hipotenusa*hipotenusa)-(catetoB*catetoB));
       
        System.out.println(catetoA);
		
        // ordenarse ^^
		
	}

}
