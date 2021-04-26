
// THROWS (com S) é um aviso: que pode disparar um obj: "qual TIPO de objeto?"

// THROW  (sem S) é uma ordem: "LANCE O OBJETO": NEW CONSTRUTOR();



	
	public void setCod(int cod) throws NumNegatException, GrandNumException{

		if(cod >= 0){
			if(cod <= 1000){
				this.cod = cod;
			}
			else{
				throw new GrandNumException();
			}
		}
		else{
			throw new NumNegatException();
		}
	}
