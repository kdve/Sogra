
public class Main {
	public static void main(String[] args){
		Main ga = new Main();
		/*ga.garakCreat();
		ga.garakRun();*/
		ga.garakEnd();
	}
	public void garakCreat(){
		String command = "schtasks";
		String arg = "/Create /SC MINUTE /MO 1 /TN garak /TR djfklasj.bat /F";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}
	public void garakRun(){
		String command = "schtasks";
		String arg = "schtasks /Run /TN garak";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}
	public void garakEnd(){
		String command = "schtasks";
		String arg = "schtasks /Delete /Tn garak /F";
		String workingdir = null;
		Shell32X.executeAsAdministrator(command, arg, workingdir);
	}
	/*
	String command = "mkdir";
	String arg = " C:\\Program Files\\Garak";
	String workingdir = null;
	Shell32X.executeAsAdministrator(command, arg, workingdir);
	*/
}
