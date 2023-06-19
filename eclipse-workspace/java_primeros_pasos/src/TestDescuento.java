
public class TestDescuento {

	public static void main(String[] args) {

		double valorCompra = 300.00;
		double valorPagado = valorCompra;
		boolean descuento1 = valorCompra >= 100.00 && valorCompra < 199.99;
		boolean descuento2 = valorCompra >= 200.00 && valorCompra < 299.99;
		boolean descuento3 = valorCompra >= 300.00;
		boolean noDescuento = valorCompra > 0 && valorCompra <= 99.99;

		if (descuento1) {

			valorPagado = valorCompra - (valorCompra * 0.1);
			System.out.println("Gracias por su compra, ha obtenido un descuento del 10%");
			System.out.println("El pago requerido es de: " + valorPagado);

		}

		if (descuento2) {

			valorPagado = valorCompra - (valorCompra * 0.15);
			System.out.println("Gracias por su compra, ha obtenido un descuento del 15%");
			System.out.println("El pago requerido es de: " + valorPagado);

		}

		if (descuento3) {

			valorPagado = valorCompra - (valorCompra * 0.2);
			System.out.println("Gracias por su compra, ha obtenido un descuento del 20%");
			System.out.println("El pago requerido es de: " + valorPagado);

		}
		if (noDescuento) {

			System.out.println("Gracias por su compra, aumente su consumo para obtener descuento");
			System.out.println("El pago requerido es de: " + valorPagado);
		}
	}
}
