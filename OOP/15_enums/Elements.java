public enum Elements{
	HYDROGEN(1),
	HELIUM(2),
	LITHIUM(3),
	BERYLIUM(4),
	BORON(5),
	CARBON(6),
	NITROGEN(7),
	OXYGEN(8),
	FLUORINE(9),
	NEON(10),
	SODIUM(11),
	MAGNESIUM(12),
	ALUMINIUM(13),
	SILICON(14),
	PHOSPHORUS(15),
	SULFUR(16),
	CHLORINE(17),
	ARGON(18),
	POTASSIUM(19),
	CALCIUM(20);

	Elements(int level){
		elements=level;
	}
	 
	
	private int elements;

	public int getElements(){
		return elements;
	}	
}