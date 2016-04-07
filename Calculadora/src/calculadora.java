class calculadora {
	//Primero los atributos
	float num1;
	float num2;
	//Se hace una llamada a los constructores
	public calculadora(){
		num1=0;
		num2=0;
	}
	public calculadora(float numero1,float numero2){
		this.num1=numero1;
		this.num2=numero2;
	}
	//Se crean las operaciones (METODOS)
	public float MULTIPLICACION(){
		return num1*num2;
	}
	public float DIVISION(){
		return num1/num2;
	}
	public float SUMA(){
		return num1+num2;
	}
	public float RESTA(){
		return num1-num2;
	}
	public void imprimir(){
		System.out.println("suma"+SUMA());
		System.out.println("resta "+RESTA());
		System.out.println("division"+ DIVISION());
		System.out.println("multiplicacion"+ MULTIPLICACION());
	}
}

