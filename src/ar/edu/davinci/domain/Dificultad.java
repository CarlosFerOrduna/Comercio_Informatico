package ar.edu.davinci.domain;

enum Dificultad {

	UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5);

	private Integer nivelDificultad;

	private Dificultad(Integer nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public Integer getNivelDificultad() {
		return nivelDificultad;
	}
}
