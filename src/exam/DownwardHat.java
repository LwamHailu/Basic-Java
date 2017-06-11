package exam;

public class DownwardHat extends Figure {

	@Override
	String getfigure() {/////try with void and without to string override
		return"\\/";
	}
	
	public String toString(){
		return getfigure();
	}
}
