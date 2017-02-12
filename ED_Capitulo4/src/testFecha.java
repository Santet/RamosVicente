import junit.framework.TestCase; 

public class testFecha extends TestCase{
	private validarFecha svfecha1 = new validarFecha(23, 7, 2010);
	
	private validarFecha nvfecha2 = new validarFecha(31, 2, 2018);
	private validarFecha nvfecha3 = new validarFecha(0, 11, 2019);
	private validarFecha nvfecha4 = new validarFecha(3, 23, 2000);
	private validarFecha nvfecha5 = new validarFecha(7, -3, 2016);
	private validarFecha nvfecha6 = new validarFecha(22, 8, -2000);
	
	public void testCuenta(){
		
		assertEquals(true, svfecha1.valida());
		assertEquals(false, nvfecha2.valida());
		assertEquals(false, nvfecha3.valida());
		assertEquals(false, nvfecha4.valida());
		assertEquals(false, nvfecha5.valida());
		assertEquals(false, nvfecha6.valida());
		
	}
}
