package ba.unsa.etf.rpr.tutorijal03;

public class  TelefonskiBroj {
	/*public String ispisi() {
		return null;
	}*/

    public static void main(String[] args) {

    }
	class FiksniBroj extends TelefonskiBroj {
		/*FiksniBroj(Grad grad,String broj);
		void ispisi();*/
	}
	class MobilniBroj extends TelefonskiBroj {
		int mobilnaMreza;
		String broj;
		MobilniBroj(int mobilnaMreza, String broj){
			this.mobilnaMreza=mobilnaMreza;
			this.broj=broj;
		}
		/*String ispisi(){
			return null;
		}*/
	}
	class MedunarodniBroj extends TelefonskiBroj {
    	String drzava;
    	String broj;
    	MedunarodniBroj(String drzava,String broj) {
    		this.drzava=drzava;
    		this.broj=broj;
		}
	}

}


