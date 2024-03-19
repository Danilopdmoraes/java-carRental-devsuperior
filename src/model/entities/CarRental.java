package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	// #1: colocando as horas:
	private LocalDateTime start;
	private LocalDateTime finish;
	
	// #3: colocando as associações
	// obs. associações colocadas APÓS construir as duas classes: vehicle e invoice
	private Vehicle vehicle;
	private Invoice invoice;
	
	// #2: constructor sem argumentos:
	public CarRental() {
	}
	
	// #4: constructor COM argumentos:
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	// #5: getters and setters:

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

	
	

}
