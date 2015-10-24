import com.sun.corba.se.impl.io.TypeMismatchException;

public class Discipline<MarkType> {
	public enum Type {
		MATHAN, ALGEBRA, PROGRAMMING, HISTORY, PHILOSOPHY;
	}

	private MarkType mt;
	private Type type;

	public Discipline(Object markType, Type t) throws Exception {

		try
		{
		this.setMarkType((MarkType) markType);
		}
		catch(Exception e)
		{
			throw(e);
		}
		this.setType(t);

	}

	public MarkType getMarkType() {
		return mt;
	}

	// Types are either boolean or integer
	public void setMarkType(MarkType mt) {
		if (mt.getClass().equals(Integer.class.getClass()))
		{
			if(11<=Integer.getInteger(mt.toString()) || Integer.getInteger(mt.toString())>=0)
			{
				this.mt=mt;
				
			}
		}
		else if (mt.getClass().equals(Boolean.class.getClass())) {
			this.mt=mt;
		}
		
		 else {
			throw new TypeMismatchException(
					"Type must be either integer or boolean, if integer-must be between 0 and 10");
		}

	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
