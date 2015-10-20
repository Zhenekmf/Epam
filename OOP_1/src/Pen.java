public class Pen {
	public enum color {
		RED, BLUE, BLACK, GREEN
	}

	public enum material {
		PLASTIC, METAL, WOOD
	}

	public enum type {
		GEL, BALL, CAPILLAR
	}
	

	private color Color;
	private material Material;
	private type Type;
	private String label;

	public Pen(color color, material material, type type, String label) {
		Color = color;
		Material = material;
		Type = type;
		this.label = label;

	}

	@Override
	public boolean equals(Object obj) {
		Pen pen2 = null;
		try {
			pen2 = (Pen) obj;
		} catch (Exception e) {
			try {
				throw e;
			} catch (Exception e1) {

			}

		}
		if (pen2 == null)
			throw new NullPointerException();
		if (pen2.Color == this.Color && pen2.label.equals(this.label)
				&& pen2.Material == this.Material && pen2.Type == this.Type)
			return true;

		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return this.Color.toString() + " " + this.Type.toString() + " "
				+ this.Material.toString() + " " + this.label;

	}

}
