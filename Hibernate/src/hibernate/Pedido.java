package hibernate;

import java.util.Date;

public class Pedido {
	private int id;
	private Date fecha;

	public Pedido() {}
	public Pedido(int id, Date fecha) {
		this.id = id;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date date) {
		this.fecha = (Date) date;
	}
	
	

}
