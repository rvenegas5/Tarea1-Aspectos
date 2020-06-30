package com.aspects;

public aspect colors {

	pointcut redColorSuccess() : call(* cambiarRojo*(..) );
	after() : redColorSuccess() {
		System.out.println("** Color de fondo Rojo **");
	}

	pointcut blackColorSuccess() : call(* cambiarNegro*(..) );
	after() : blackColorSuccess() {
		System.out.println("** Color de fondo Negro **");
	}

	pointcut blueColorSuccess() : call(* cambiarAzul*(..) );
	after() : blueColorSuccess() {
		System.out.println("** Color de fondo Blue **");
	}
}
