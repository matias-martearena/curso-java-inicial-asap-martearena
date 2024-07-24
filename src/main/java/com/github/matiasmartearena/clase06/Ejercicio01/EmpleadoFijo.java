package com.github.matiasmartearena.clase06.Ejercicio01;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(int dni, String nombre, String apellido, int ingreso, double salario) {
		super(dni, nombre, apellido, ingreso, salario);
	}

	/* ---------------------------------------------------------------- */

	@Override
	public double mostrarSalario() {

		int antiguedad = 2024 - ingreso;
		double salarioCalculado = salario;

		if (antiguedad >= 2 && antiguedad <= 5) {
			salarioCalculado += salario * 0.05;
		} else if (antiguedad >= 6 && antiguedad <= 10) {
			salarioCalculado += salario * 0.10;
		} else if (antiguedad > 10) {
			salarioCalculado += salario * 0.15;
		}

		return salarioCalculado;
	}
}