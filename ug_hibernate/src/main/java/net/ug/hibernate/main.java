package net.ug.hibernate;

public class main {

	public static void main(String[] args) {
		crear();
		read();
		update();
		delete();
		
		
	}
	public static void crear() {
		Musico musico = new Musico(1,"Maria"," Tambor","12-08-1998", "20-11-2018");
		DaoMusico daoMusico = new DaoMusico();
		daoMusico.setup();
		daoMusico.crear(musico);
		musico= new Musico(2,"Juanes","Piano"," 17-01-1960","20-04-2015");
		daoMusico.crear(musico);	
	}
	
	public static void read() {
		DaoMusico daoMusico = new DaoMusico();
		daoMusico.setup();
		Musico musico = daoMusico.read(1);
		musico.imprimir();
	}

	public static void update() {

		DaoMusico daoMusico = new DaoMusico();
		daoMusico.setup();
		Musico musico = daoMusico.read(1);
		musico.setNombre("Jose");
		daoMusico.update(musico);
	}
	
	public static void delete() {
		DaoMusico daoMusico = new DaoMusico();
		daoMusico.setup();
		daoMusico.delete(1);
	}

}
