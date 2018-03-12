package Command;

public class Application {
		public static void error() {
			System.out.println("Error");
		}
		public static void main(String[] args) {
		Rec prog = new Rec();
		Run runner = new Run(
				new Help(prog), 
				new Echo(prog), 
				new Date(prog), 
				new Exit(prog)
		);
		
		// TODO Auto-generated method stub
		if (args==null||args.length==0||args.length>2) {
			error();
		}
		else if (args[0]==null||args[0].equals("")) {
			error();
		}
		else {
			switch (args[0]){
				case "help":
					if(args.length==1) {
					runner.helpRun();
					}else {
						error();
					}
					break;
				case "echo":
					prog.get(args[1]);
					runner.echoRun();
					break;
				case "date":
					prog.get(args[1]);
					runner.dateRun();
					break;
				case "exit":
					if(args.length==1) {
						runner.exitRun();
						}else {
							error();
						}					
					break;
				default:
					error();
					break;
			}
			
	}

	}
}

//Reciver
class Rec {
	String print;
	public void help() {
		Application.error();
	}
	public void echo() {
		System.out.println(print);
	}
	public void date() {
		if (print.equals("now")) {
			System.out.println(System.currentTimeMillis());
		}else {
			Application.error();
		}
	}
	public void exit() {
		System.out.println("Goodbye!");
	}
	public void get(String a) {
		print = a;
	}
	
}

class Help implements Command{
	Rec prog;
	public Help(Rec prog2) {
		this.prog=prog2;// TODO Auto-generated constructor stub
	}
	//public void Help(Reciver prog) {;} 
	public void execute() {
		prog.help();
	}
}

class Echo implements Command{
	
	Rec prog;
	public Echo(Rec prog2) {this.prog=prog2;} 
	public void execute() {
		prog.echo();
	}
}

class Date implements Command{
	Rec prog;
	public Date(Rec prog2) {
		this.prog=prog2;
	}
	//public void Date(Reciver prog2) {} 
	public void execute() {
		prog.date();
	}
}

class Exit implements Command{
	Rec prog;
	public Exit(Rec prog2) {this.prog=prog2;} 
	public void execute() {
		prog.exit();
	}
}
//Invoker
class Run{
	Command help;
	Command echo;
	Command date;
	Command exit;
	
	public Run(Command help, Command echo, Command date, Command exit) {
		this.help = help;
		this.echo = echo;
		this.date = date;
		this.exit = exit;
	}
	public void echoRun(String string) {
		echo.execute();
		
	}
	public void helpRun() {
		help.execute();
	}
	public void echoRun() {
		echo.execute();
	}
	public void dateRun() {
		date.execute();
	}
	public void exitRun() {
		exit.execute();
	}
}
	